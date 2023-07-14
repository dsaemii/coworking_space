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

    public Integer getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }

    public User getUser_idfs() {
        return user_idfs;
    }

    public void setUser_idfs(User user_idfs) {
        this.user_idfs = user_idfs;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
