package com.cabbooking.Cab.booking.service;

import com.cabbooking.Cab.booking.execption.UserNotFound;
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

    public String driverAuthentication(String email,String password){
        Driver driver = driverRepository.findByEmail(email);
        if(driver==null){
            throw new UserNotFound("Driver with " + email + " is not found");
        }
        String orignalPassword=driver.getPassWord();
        if(orignalPassword.equals(password)){
            return "Authentication sucessfull";
        }
        return "Authentication failed";
    }
}
