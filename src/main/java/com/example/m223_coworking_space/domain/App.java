package com.example.m223_coworking_space.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        // Testdaten
        User user1 = new User("Emanuel", "Kantus", "emanuel@kantus.com", "dsjfh/&7");
        User user2 = new User("Rosa", "Flores", "rosa@flores.ch", "HJ8&%!");
        User user3 = new User("Ella", "Heller", "ella@heller.ch", "JDGKK_KS/!");
        User user4 = new User("Jack", "Emslie", "jack@emslie.za", "JemmasZT56?!");

        Booking booking1 = new Booking(user2, new Date(2023, 07, 13), true, false);
        booking1.setState(true);
        Booking booking2 = new Booking(user2, new Date(2023, 07, 12), false, true);
        booking2.setState(true);
        Booking booking3 = new Booking(user3, new Date(2023, 07, 15), true, true);
        Booking booking4 = new Booking(user4, new Date(2023, 07, 16), false, true);
    }

}
