package com.example.m223_coworking_space.repository;

import com.example.m223_coworking_space.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
}
