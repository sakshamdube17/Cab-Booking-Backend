package com.cabbooking.Cab.booking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Driver {
    @Id
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

    public Driver(int id, String licenceId, String vehicleType, String firstName, String lastName, String email, String passWord, Long phoneNo, double rating, int totalRides) {
        this.id = id;
        this.licenceId = licenceId;
        this.vehicleType = vehicleType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.phoneNo = phoneNo;
        this.rating = rating;
        this.totalRides = totalRides;
    }

    public Driver() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLicenceId(String licenceId) {
        this.licenceId = licenceId;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public int getId() {
        return id;
    }

    public String getLicenceId() {
        return licenceId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return passWord;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public double getRating() {
        return rating;
    }

    public int getTotalRides() {
        return totalRides;
    }
}
