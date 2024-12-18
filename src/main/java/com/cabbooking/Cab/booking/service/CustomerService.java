package com.cabbooking.Cab.booking.service;

import com.cabbooking.Cab.booking.execption.UserNotFound;
import com.cabbooking.Cab.booking.model.Customer;
import com.cabbooking.Cab.booking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void registerAccount (Customer customer){
        customerRepository.save(customer);
    }

    public String authenticateCustomer(String email,String password){
           Customer customer =customerRepository.findByEmail(email);
           if(customer==null){
               throw new UserNotFound(String.format("user with %s doest not exist",email));
           }
           String originalPassword=customer.getPassword();
           if(originalPassword.equals(password)){
               return "Authentication sucessfull";
           }
           return "Authentication failed";
    }

    public Customer getCustomerById(int customerId){
        return customerRepository.findById(customerId);
    }
}
