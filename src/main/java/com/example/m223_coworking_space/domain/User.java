package com.example.m223_coworking_space.domain;

import jakarta.persistence.*;

@Entity
public class User {
    private @Id
    @GeneratedValue Integer user_id;

    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private boolean isAdmin;

    public User() {}

    public User(String first_name, String last_name, String email, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        if(user_id == 1) {
            this.isAdmin = true;
        } else {
            this.isAdmin = false;
        }
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
