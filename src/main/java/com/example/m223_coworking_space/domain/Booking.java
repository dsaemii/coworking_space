package com.example.m223_coworking_space.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Booking {
    private @Id
    @GeneratedValue Integer booking_id;

    @ManyToOne
    private User user_idfs;
    private Date date;
    private boolean morning;
    private boolean afternoon;
    private boolean state;
    private String comment;

    public Booking() {}

    public Booking(User user_idfs, Date date, boolean morning, boolean afternoon) {
        this.user_idfs = user_idfs;
        this.date = date;
        this.morning = morning;
        this.afternoon = afternoon;
    }
}
