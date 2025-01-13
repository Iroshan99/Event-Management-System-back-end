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
    @JoinColumn(name = "participant_id")
    private User participant;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
