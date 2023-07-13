package com.example.m223_coworking_space.repository;

import com.example.m223_coworking_space.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
