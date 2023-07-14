package com.example.m223_coworking_space.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}