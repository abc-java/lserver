package org.example.response.student;

import org.example.entity.Student;
import org.example.request.student.GetStudentByIdRequest;

public class GetStudentByIdResponse {
    private long id;
    private Student student;

    public GetStudentByIdResponse(long id, Student student) {
        this.id = id;
        this.student = student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
