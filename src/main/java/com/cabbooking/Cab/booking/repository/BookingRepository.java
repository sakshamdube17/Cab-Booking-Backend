package com.cabbooking.Cab.booking.repository;

import com.cabbooking.Cab.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository <Booking,Integer>{
}
