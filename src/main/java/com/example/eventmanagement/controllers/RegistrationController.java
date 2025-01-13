package com.example.eventmanagement.controller;

import com.example.eventmanagement.models.Registration;
import com.example.eventmanagement.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    @Autowired
    private ApiService apiService;

    @GetMapping
    public List<Registration> getRegistrations() {
        return apiService.getRegistrations();
    }

    @PostMapping
    public Registration register(@RequestBody Registration registration) {
        return apiService.register(registration);
    }
}
