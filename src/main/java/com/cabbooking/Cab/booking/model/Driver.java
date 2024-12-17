package com.cabbooking.Cab.booking.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    @Column(unique = true,nullable = false)
    private String licenceId;
    private String vehicleType;
    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true)
    private String passWord;
    @Column(unique = true,nullable = false,length=10)
    private Long phoneNo;
    private double rating;
    private int totalRides;
@OneToMany(mappedBy = "driver")
    private List<Booking> bookingList;


}
