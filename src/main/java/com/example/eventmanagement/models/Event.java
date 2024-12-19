package com.example.eventmanagement.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String location;
    @Column
    private int capacity;
    @Column
    private String date;
    @Column
    private String time;

    @ManyToOne
    private User organizer;

    @OneToMany(mappedBy = "event")
    private List<Registration> registrations;

    // Getters and Setters

}
