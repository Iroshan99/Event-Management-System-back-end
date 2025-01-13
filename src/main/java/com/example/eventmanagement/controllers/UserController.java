package com.example.eventmanagement.controllers;

import com.example.eventmanagement.models.User;
import com.example.eventmanagement.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private ApiService apiService;

    @GetMapping
    public List<User> getUsers() {
        return apiService.getUsers();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return apiService.addUser(user);
    }
}
