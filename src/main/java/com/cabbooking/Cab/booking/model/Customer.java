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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column( unique = true, nullable = false)
    private String email;
    private String password;
    private String address;
    @Column(unique = true,nullable = false,length = 10)
    private Long phoneNo;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookingList;


}
