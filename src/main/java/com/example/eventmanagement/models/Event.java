package com.example.eventmanagement.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 500)
    private String description;

    private String location;

    private int capacity;

    private LocalDate date;

    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private User organizer;
}
