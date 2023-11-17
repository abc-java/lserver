package org.example.entity;

public class GroupStudent {
    private long id;
    private String name;

    public GroupStudent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
