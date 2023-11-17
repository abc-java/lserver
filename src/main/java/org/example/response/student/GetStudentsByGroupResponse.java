package org.example.response.student;

import org.example.entity.Student;

import java.util.List;

public class GetStudentsByGroupResponse {
    private List<Student> studentList;
    long id;
    public GetStudentsByGroupResponse(List<Student> studentList, long id) {
        this.studentList = studentList;
        this.id = id;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
