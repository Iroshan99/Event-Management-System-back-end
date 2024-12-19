package com.example.eventmanagement.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String role; // "organizer" or "participant"

    // Getters and Setters
}
