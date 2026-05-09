package com.example.TodoApp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private TodoStatus status;

    private LocalDate deadline;

    @Enumerated(EnumType.STRING)
    private TodoPriority priority;
}