package com.example.eventmanagement.controllers;

import com.example.eventmanagement.models.Registration;
import com.example.eventmanagement.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public Registration registerUser(@RequestBody Registration registration) {
        return registrationService.registerUser(registration);
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }
}
