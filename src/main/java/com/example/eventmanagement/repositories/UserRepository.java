package com.example.eventmanagement.repositories;

import com.example.eventmanagement.models.User;
import com.example.eventmanagement.models.Event;
import com.example.eventmanagement.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
