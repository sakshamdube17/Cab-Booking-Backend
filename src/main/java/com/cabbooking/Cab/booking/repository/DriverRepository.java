package com.cabbooking.Cab.booking.repository;

import com.cabbooking.Cab.booking.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Integer> {
    public Driver findByEmail(String email);
}
