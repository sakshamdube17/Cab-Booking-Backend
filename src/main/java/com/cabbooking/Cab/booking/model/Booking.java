package com.cabbooking.Cab.booking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private int id;
    @JsonIgnore
    @ManyToOne
    private Customer customer;
    private int billAmount;
    private String status;
    private String feedback;
    @JsonIgnore
    @ManyToOne
    private Driver driver;
    private String startingPoint;
    private String endingPoint;
}
