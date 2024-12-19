package com.example.eventmanagement.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
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

