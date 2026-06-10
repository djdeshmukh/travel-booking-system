package com.travel.booking.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.travel.booking.entity.*;
import com.travel.booking.repository.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.travel.booking.dto.*;

@Service
public class BookingService {

    private final TripRepository tripRepo;
    private final BookingRepository bookingRepo;

    public BookingService(TripRepository tripRepo, BookingRepository bookingRepo) {
        this.tripRepo = tripRepo;
        this.bookingRepo = bookingRepo;
    }

    @Transactional
    public Booking book(BookingRequest req) {

    	   Trip trip = tripRepo.findByIdForUpdate(req.getTripId())
    	            .orElseThrow(() -> new RuntimeException("Trip not found"));

    	    if (trip.getAvailableSeats() < req.getSeats()) {
    	        throw new RuntimeException("Seats not available");
    	    }

    	    trip.setAvailableSeats(
    	            trip.getAvailableSeats() - req.getSeats());

        Booking b = new Booking();
        b.setTrip(trip);
        b.setSeats(req.getSeats());
        b.setStatus("CONFIRMED");

        return bookingRepo.save(b);
    }

    public String addTrip(TripRequest req) {

        ObjectMapper mapper = new ObjectMapper();

        Trip trip = mapper.convertValue(req, Trip.class);

        tripRepo.save(trip);

        return "Trip added.";
    }
}
