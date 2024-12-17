package com.cabbooking.Cab.booking.service;

import com.cabbooking.Cab.booking.model.Driver;
import com.cabbooking.Cab.booking.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;
    public void driverRegistration(Driver driver){
        driverRepository.save(driver);
    }
}
