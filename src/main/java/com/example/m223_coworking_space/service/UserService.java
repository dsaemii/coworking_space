package com.example.m223_coworking_space.service;

import com.example.m223_coworking_space.domain.User;
import com.example.m223_coworking_space.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }
}
