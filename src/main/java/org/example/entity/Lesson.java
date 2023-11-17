package org.example.entity;


import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    private final LocalDate localDate;
    private final LocalTime localTime;
    private final Teacher teacher;
    private final GroupStudent groupStudent;
    private final long id;

    public Lesson(LocalDate localDate, LocalTime localTime, Teacher teacher, GroupStudent groupStudent, long id) {
        this.localDate = localDate;
        this.localTime = localTime;
        this.teacher = teacher;
        this.groupStudent = groupStudent;
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public GroupStudent getGroupStudent() {
        return groupStudent;
    }

    public long getId() {
        return id;
    }
}
