package com.example.eventmanagement.services;

import com.example.eventmanagement.models.Event;
import com.example.eventmanagement.models.Registration;
import com.example.eventmanagement.models.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers();
    User addUser(User user);

    List<Event> getEvents();
    Event addEvent(Event event);

    List<Registration> getRegistrations();
    Registration register(Registration registration);
}
