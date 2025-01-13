package com.example.eventmanagement.controller;

import com.example.eventmanagement.models.Event;
import com.example.eventmanagement.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private ApiService apiService;

    @GetMapping
    public List<Event> getEvents() {
        return apiService.getEvents();
    }

    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return apiService.addEvent(event);
    }
}
