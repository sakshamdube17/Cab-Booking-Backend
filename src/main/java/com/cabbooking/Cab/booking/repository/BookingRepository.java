package com.cabbooking.Cab.booking.repository;

import com.cabbooking.Cab.booking.controller.BookingController;
import com.cabbooking.Cab.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository <Booking,Integer>{
    @Query(value = "select * from booking where status=:state",nativeQuery = true)
    public  List<Booking> getBookingByStatus(String state);
}
