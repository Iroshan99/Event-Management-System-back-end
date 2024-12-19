package com.example.eventmanagement.services;

import com.example.eventmanagement.models.Event;
import com.example.eventmanagement.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }
}
