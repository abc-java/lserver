package org.example.entity;

public class Subject {
    String name;
    long id;

    public Subject(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
