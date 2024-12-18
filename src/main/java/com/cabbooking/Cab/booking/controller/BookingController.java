package com.cabbooking.Cab.booking.controller;

import com.cabbooking.Cab.booking.execption.UserNotFound;
import com.cabbooking.Cab.booking.requestBody.customerBookingRequestBody;
import com.cabbooking.Cab.booking.responseBody.BookingResponseBody;
import com.cabbooking.Cab.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping("/request")
    public String requestCustomerBooking(@RequestBody customerBookingRequestBody customerBookingRequestBody,
                                         @RequestParam int customerId){
        try{
            bookingService.handleCustomerRequest(customerBookingRequestBody.getStartingPoint(),
                    customerBookingRequestBody.getEndingPoint(),customerId);
            return "Waiting for driver to accept";
        }catch (UserNotFound userNotFound){
           return  userNotFound.getMessage();
        }

    }

    @GetMapping("/all")
    public List<BookingResponseBody> getBookingTableByStatus(@RequestParam String state){
        return bookingService.getBookingTable(state);
    }
}
