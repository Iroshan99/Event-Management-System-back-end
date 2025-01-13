package com.example.eventmanagement.services;

import com.example.eventmanagement.models.Event;
import com.example.eventmanagement.models.Registration;
import com.example.eventmanagement.models.User;
import com.example.eventmanagement.repositories.EventRepository;
import com.example.eventmanagement.repositories.RegistrationRepository;
import com.example.eventmanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Registration> getRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration register(Registration registration) {
        return registrationRepository.save(registration);
    }
}
