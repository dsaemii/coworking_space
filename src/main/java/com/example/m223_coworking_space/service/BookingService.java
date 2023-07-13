package com.example.m223_coworking_space.service;

import com.example.m223_coworking_space.domain.Booking;
import com.example.m223_coworking_space.repository.BookingRepository;

import java.util.List;

public class BookingService {
    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.saveAndFlush(booking);
    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public void deleteAll() {
        bookingRepository.deleteAll();
    }
}
