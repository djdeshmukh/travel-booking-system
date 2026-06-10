
package com.travel.booking.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.booking.dto.BookingRequest;
import com.travel.booking.dto.TripRequest;
import com.travel.booking.entity.Booking;
import com.travel.booking.service.BookingService;

@RestController
@RequestMapping("/book")
public class BookingController {

    private final BookingService service;

    public BookingController(BookingService service) {
       this.service = service;
   }

    @PostMapping
    public Booking book(@RequestBody BookingRequest req) throws Exception {
        return service.book(req);
    }
    
    @PostMapping("/trip")
    public String book(@RequestBody TripRequest req) throws Exception {
        return service.addTrip(req);
    }
    
}
