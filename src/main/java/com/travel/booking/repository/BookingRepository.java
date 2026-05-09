
package com.travel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.booking.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
