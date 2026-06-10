
package com.travel.booking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import com.travel.booking.entity.Trip;

import jakarta.persistence.LockModeType;

public interface TripRepository extends JpaRepository<Trip, Long> {
	
	  @Lock(LockModeType.PESSIMISTIC_WRITE)
	    @Query("select t from Trip t where t.id = :id")
	    Optional<Trip> findByIdForUpdate(Long id);
}
