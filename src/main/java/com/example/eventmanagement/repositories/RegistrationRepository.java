package com.example.eventmanagement.repositories;

import com.example.eventmanagement.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
