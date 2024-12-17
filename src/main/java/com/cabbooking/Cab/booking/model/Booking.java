package com.cabbooking.Cab.booking.model;

import jakarta.persistence.*;
import lombok.*;
import org.yaml.snakeyaml.events.Event;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne
    Customer customer;
    int billAmount;
    String status;
    String feedback;
    @ManyToOne
    Driver driver;
}
