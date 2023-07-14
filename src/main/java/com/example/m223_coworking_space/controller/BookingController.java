package com.example.m223_coworking_space.controller;

import com.example.m223_coworking_space.domain.Booking;
import com.example.m223_coworking_space.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Booking> getAllBookings() {
        return bookingService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Booking getBookingById(@PathVariable Integer id) {
        return bookingService.getBookingById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Booking updateBooking(@RequestBody Booking booking) {
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteBookings() {
        bookingService.deleteAll();
    }
}
