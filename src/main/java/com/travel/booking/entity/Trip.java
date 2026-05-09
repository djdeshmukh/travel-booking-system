
package com.travel.booking.entity;

import jakarta.persistence.*;

@Entity
public class Trip {
    @Id @GeneratedValue
    private Long id;
    private String source;
    private String destination;
    private double price;
    private int availableSeats;

    public Long getId() { return id; }
    public int getAvailableSeats() { return availableSeats; }
    public void setAvailableSeats(int seats) { this.availableSeats = seats; }
}
