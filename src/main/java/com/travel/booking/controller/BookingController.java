
package com.travel.booking.controller;

import org.springframework.web.bind.annotation.*;
import com.travel.booking.service.*;
import com.travel.booking.dto.*;
import com.travel.booking.entity.*;

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
}
