package com.cabbooking.Cab.booking.service;

import com.cabbooking.Cab.booking.execption.UserNotFound;
import com.cabbooking.Cab.booking.model.Booking;
import com.cabbooking.Cab.booking.model.Customer;
import com.cabbooking.Cab.booking.repository.BookingRepository;
import com.cabbooking.Cab.booking.responseBody.BookingResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    CustomerService customerService;
    @Autowired
    BookingRepository bookingRepository;
    public void handleCustomerRequest(String startingPoint,String endingPoint,int customerId){
        Customer customer=customerService.getCustomerById(customerId);
        if(customer==null){
            throw new UserNotFound("Customer with "+ customerId + " not exist.");
        }

        Booking booking=new Booking();
        booking.setCustomer(customer);
        booking.setStartingPoint(startingPoint);
        booking.setEndingPoint(endingPoint);
        booking.setStatus("Draft");
        booking.setBillAmount(0);

        bookingRepository.save(booking);
    }

    public List<BookingResponseBody> getBookingTable(String state){
        List<Booking> bookingList=bookingRepository.getBookingByStatus(state);
        List<BookingResponseBody> bookingResponseBodieList =new ArrayList<>();
        for(Booking booking:bookingList){
             BookingResponseBody bookingResponseBody=new BookingResponseBody();
             bookingResponseBody.setBookingId(booking.getId());
             bookingResponseBody.setCustomerId(booking.getCustomer().getId());
             bookingResponseBody.setCustomerName(booking.getCustomer().getFirstName());
             bookingResponseBody.setStartingPoint(booking.getStartingPoint());
             bookingResponseBody.setEndingPoint(booking.getEndingPoint());
             bookingResponseBody.setStatus(booking.getStatus());
             bookingResponseBodieList.add(bookingResponseBody);
        }
        return  bookingResponseBodieList;
    }
}
