package com.example.shahbazi;

import java.util.*;
import java.util.stream.Collectors;

public class Report {

    // Sort users by name
    public static List<Person> sortUsersByName(List<Person> users) {
        return users.stream()
                .sorted(Comparator.comparing(person -> person.getName() + " " + person.getSurname()))
                .collect(Collectors.toList());
    }

    // Group users by city
    public static Map<String, List<Person>> groupUsersByCity(List<Person> users) {
        return users.stream()
                .collect(Collectors.groupingBy(person -> person.getAddress().getCity()));
    }

    // Group users by country
    public static Map<String, List<Person>> groupUsersByCountry(List<Person> users) {
        return users.stream()
                .collect(Collectors.groupingBy(person -> person.getAddress().getCountry()));
    }

    // Partition users by age (e.g., adults and minors with age 18 as threshold)
    public static Map<Boolean, List<Person>> partitionUsersByAge(List<Person> users, int ageThreshold) {
        return users.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() > ageThreshold));
    }

    // Count total number of users
    public static long countTotalUsers(List<Person> users) {
        return users.size();
    }

    // Calculate the average age of users
    public static double calculateAverageAge(List<Person> users) {
        return users.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
}

