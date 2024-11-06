package com.example.shahbazi;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;
    private TaskManager<Task> taskManager;

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.taskManager = new TaskManager<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public TaskManager<Task> getTaskManager() {
        return taskManager;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", Age: " + age + ", Address: " + address;
    }
}

