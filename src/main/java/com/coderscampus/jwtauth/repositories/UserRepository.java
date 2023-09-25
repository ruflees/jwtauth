package com.coderscampus.jwtauth.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.jwtauth.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByEmail(String email);
    
}
