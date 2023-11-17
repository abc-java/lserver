package org.example.entity;

public class Student {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    private final StudentStatus studentStatus;
    private final GroupStudent group;

    private final long id;

    public Student(String lastName, String firstName, String middleName, StudentStatus studentStatus, GroupStudent group, long id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.studentStatus = studentStatus;
        this.group = group;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public GroupStudent getGroup() {
        return group;
    }

    public long getId() {
        return id;
    }
}
