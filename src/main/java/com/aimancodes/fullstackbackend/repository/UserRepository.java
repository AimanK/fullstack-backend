package com.aimancodes.fullstackbackend.repository;

import com.aimancodes.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
