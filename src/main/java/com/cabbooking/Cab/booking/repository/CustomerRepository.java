package com.cabbooking.Cab.booking.repository;

import com.cabbooking.Cab.booking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

public Customer findByEmail(String email);
public Customer findById(int id);
}
