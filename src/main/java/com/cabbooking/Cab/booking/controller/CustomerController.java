package com.cabbooking.Cab.booking.controller;

import com.cabbooking.Cab.booking.execption.UserNotFound;
import com.cabbooking.Cab.booking.model.Customer;
import com.cabbooking.Cab.booking.requestBody.UserCredentialRequestBody;
import com.cabbooking.Cab.booking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping("/api/customer/registration")
    public String customerRegistration(@RequestBody Customer customer){
        customerService.registerAccount(customer);
        System.out.println("Received Customer Data: " + customer.toString());
        return "Customer Registered";
    }

    @GetMapping("/api/customer/authentication")
    public String customerAuthentication(@RequestBody UserCredentialRequestBody userCredentialRequestBody){
            String email= userCredentialRequestBody.getEmail();
            String password=userCredentialRequestBody.getPassword();
           try {
               String authenticationDetails = customerService.authenticateCustomer(email, password);
               return authenticationDetails;
           }catch(UserNotFound userNotFound){
               return userNotFound.getMessage();
        }

    }
}
