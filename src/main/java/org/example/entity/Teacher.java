package org.example.entity;

public class Teacher {
    String surname;
    String name;
    String midname;
    long id;

    public Teacher(String surname, String name, String midname, long id) {
        this.surname = surname;
        this.name = name;
        this.midname = midname;
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMidname() {
        return midname;
    }

    public long getId() {
        return id;
    }
}
