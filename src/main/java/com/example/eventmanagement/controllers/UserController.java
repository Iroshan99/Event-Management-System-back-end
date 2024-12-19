package com.example.eventmanagement.controllers;


import com.example.eventmanagement.models.Event;
import com.example.eventmanagement.models.Registration;
import com.example.eventmanagement.models.User;
import com.example.eventmanagement.services.EventService;
import com.example.eventmanagement.services.RegistrationService;
import com.example.eventmanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}

