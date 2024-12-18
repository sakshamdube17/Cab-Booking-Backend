package com.cabbooking.Cab.booking.controller;

import com.cabbooking.Cab.booking.execption.UserNotFound;
import com.cabbooking.Cab.booking.model.Driver;
import com.cabbooking.Cab.booking.requestBody.UserCredentialRequestBody;
import com.cabbooking.Cab.booking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    @Autowired
    DriverService driverService;
    @PostMapping("api/driver/registration")
    public String registerAccount(Driver driver){
        driverService.driverRegistration(driver);
        return "Driver Registered";
    }

    @GetMapping("/api/driver/authentication")
    public String authenticateDriver(@RequestBody UserCredentialRequestBody userCredentialRequestBody){

        try{
            return driverService.driverAuthentication(userCredentialRequestBody.getEmail(),userCredentialRequestBody.getPassword());

        }catch(UserNotFound userNotFound){
            return userNotFound.getMessage();
        }
    }
}
