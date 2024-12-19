package com.example.eventmanagement.models;

import jakarta.persistence.*;

@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User participant;

    @ManyToOne
    private Event event;

    // Getters and Setters
}

