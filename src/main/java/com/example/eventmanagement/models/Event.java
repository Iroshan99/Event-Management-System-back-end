package com.example.eventmanagement.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private int capacity;
    private String date;
    private String time;

    @ManyToOne
    private User organizer;

    @OneToMany(mappedBy = "event")
    private List<Registration> registrations;

    // Getters and Setters
}
