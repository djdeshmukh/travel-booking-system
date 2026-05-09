
package com.travel.booking.entity;

import jakarta.persistence.*;

@Entity
public class Booking {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Trip trip;

    private int seats;
    private String status;

    public void setTrip(Trip trip) { this.trip = trip; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setStatus(String status) { this.status = status; }
}
