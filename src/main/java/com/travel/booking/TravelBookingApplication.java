
package com.travel.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TravelBookingApplication {
    public static void main(String[] args) {
        SpringApplication.run(TravelBookingApplication.class, args);
    }
}
