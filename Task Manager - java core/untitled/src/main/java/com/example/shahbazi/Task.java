package com.example.shahbazi;

import java.time.LocalDate;

public class Task {
    private int id;
    private String name;
    private String description;
    private LocalDate creationDate;
    private TaskStatus status;
    private TaskMode mode;
    private Priority priority;

    public Task(int id, String name, String description, TaskMode mode, TaskStatus status, Priority priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mode = mode;
        this.creationDate = LocalDate.now();
        this.status = status;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public TaskMode getMode() {
        return mode;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("%s [ID: %d, Name: %s, Description: %s, Status: %s, Mode: %s, Created: %s, Priority: %s]",
                getClass().getSimpleName(), id, name, description, status, mode, creationDate, priority);
    }
}

enum Priority {
    LOW, MEDIUM, HIGH
}

