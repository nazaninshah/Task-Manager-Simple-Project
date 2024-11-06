package com.example.shahbazi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskManager<T extends Task> {
    private List<T> tasks = new ArrayList<>();

    public void addTask(T task) {
        tasks.add(task);
    }

    public void displayTasks() {
        tasks.forEach(System.out::println);
    }

    // Sort tasks by name
    public void sortByName() {
        tasks.sort(Comparator.comparing(Task::getName));
    }

    // Sort tasks by creation date
    public void sortByCreationDate() {
        tasks.sort(Comparator.comparing(Task::getCreationDate));
    }

    // Sort tasks by priority
    public void sortByPriority() {
        tasks.sort(Comparator.comparing(Task::getPriority));
    }

    // Group tasks by mode
    public Map<TaskMode, List<T>> groupByMode() {
        return tasks.stream().collect(Collectors.groupingBy(Task::getMode));
    }

    // Group tasks by priority
    public Map<Priority, List<T>> groupByPriority() {
        return tasks.stream().collect(Collectors.groupingBy(Task::getPriority));
    }

    // Group tasks by status
    public Map<TaskStatus, List<T>> groupByStatus() {
        return tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
    }

    // Filter tasks by mode with an additional predicate
    public List<T> filterTasksByMode(TaskMode mode, Predicate<T> predicate) {
        return tasks.stream()
                .filter(task -> task.getMode() == mode)
                .filter(predicate)
                .collect(Collectors.toList());
    }

    // Filter tasks by status
    public List<T> filterTasksByStatus(TaskStatus status) {
        return tasks.stream().filter(task -> task.getStatus() == status).collect(Collectors.toList());
    }

    // Count tasks by status
    public Map<TaskStatus, Long> countTasksByStatus() {
        return tasks.stream().collect(Collectors.groupingBy(Task::getStatus, Collectors.counting()));
    }

    // Total number of tasks
    public long getTotalTaskCount() {
        return tasks.size();
    }
}



