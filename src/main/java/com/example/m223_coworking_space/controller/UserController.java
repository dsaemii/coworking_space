package com.example.m223_coworking_space.controller;

import com.example.m223_coworking_space.domain.User;
import com.example.m223_coworking_space.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public void loginUser(String email, String password) {
         userService.loginUser(email, password);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteUsers() {
        userService.deleteAll();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
