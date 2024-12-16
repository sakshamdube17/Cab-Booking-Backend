package com.cabbooking.Cab.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Booking {

    @Id
    int id;
    @ManyToOne
    Customer customer;
    int billAmount;
    String status;
    String feedback;
    @ManyToOne
    Driver driver;
}
