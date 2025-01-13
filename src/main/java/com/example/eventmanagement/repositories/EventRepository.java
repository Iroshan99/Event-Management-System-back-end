package com.example.eventmanagement.repositories;

import com.example.eventmanagement.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
