package com.atm.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}