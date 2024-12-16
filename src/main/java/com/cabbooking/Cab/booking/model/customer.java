package com.cabbooking.Cab.booking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    @Column(unique = true)
    private int phoneNo;
    @Column(unique = true)
    private String emailId;
    private String password;
}
