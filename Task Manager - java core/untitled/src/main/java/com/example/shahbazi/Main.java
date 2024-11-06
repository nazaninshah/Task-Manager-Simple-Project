package com.example.shahbazi;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample persons
        Person person1 = new Person("Nazi", "Shah", 17, new Address("Iran", "Hamedan", "Daneshgah", 127));
        Person person2 = new Person("Az", "Shah", 15, new Address("Iran", "Tehran", "Namjoo", 58));
        Person person3 = new Person("Mar", "Sam", 53, new Address("Iran", "Tehran", "Namjoo", 58));

        // Sample tasks
        person1.getTaskManager().addTask(new Task(1, "Implement Login", "Login feature", TaskMode.WORK, TaskStatus.NOT_STARTED, Priority.HIGH));
        person1.getTaskManager().addTask(new Task(2, "Study Algorithms", "Review algorithms", TaskMode.STUDY, TaskStatus.IN_PROGRESS, Priority.MEDIUM));

        person2.getTaskManager().addTask(new Task(3, "Bug Fix", "Fix minor bug", TaskMode.WORK, TaskStatus.COMPLETED, Priority.LOW));

        // Report on TaskManager functionalities
        System.out.println("Person 1 Tasks Sorted by Priority:");
        person1.getTaskManager().sortByPriority();
        person1.getTaskManager().displayTasks();

        System.out.println("\nPerson 1 Tasks Grouped by Priority:");
        person1.getTaskManager().groupByPriority().forEach((priority, tasks) -> {
            System.out.println(priority + ": " + tasks);
        });

        // Report on users using the Report class
        List<Person> users = List.of(person1, person2, person3);

        System.out.println("\nUsers Sorted by Name:");
        Report.sortUsersByName(users).forEach(System.out::println);

        System.out.println("\nUsers Grouped by City:");
        Report.groupUsersByCity(users).forEach((city, persons) -> {
            System.out.println(city + ": " + persons);
        });

        System.out.println("\nPartition Users by Age (18 as threshold):");
        Report.partitionUsersByAge(users, 18).forEach((isAdult, persons) -> {
            System.out.println(isAdult ? "Adults:" : "Minors:");
            persons.forEach(System.out::println);
        });

        System.out.println("\nTotal Number of Users: " + Report.countTotalUsers(users));
        System.out.println("Average Age of Users: " + Report.calculateAverageAge(users));
    }
}

