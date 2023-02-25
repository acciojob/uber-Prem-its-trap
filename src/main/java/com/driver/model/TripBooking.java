package com.driver.model;

import javax.persistence.*;

@Entity
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingTd;
    private String fromLocation;
    private String toLocation;
    private int distanceKm;
    private TripStatus tripStatus;
    private int bill;

    // this is for customer
    @ManyToOne
    @JoinColumn
    private Customer customer;

    // this is for driver, one driver can do multiple trips
    @ManyToOne
    @JoinColumn
    private Driver driver;


    // this is child for driver




    public TripBooking() {
    }

    public int getTripBookingTd() {
        return tripBookingTd;
    }

    public void setTripBookingTd(int tripBookingTd) {
        this.tripBookingTd = tripBookingTd;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}