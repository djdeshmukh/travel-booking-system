
package com.travel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.booking.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {}
