package org.example.response.student;

import org.example.request.student.AddStudentRequest;

public class AddStudentResponse {
    long id;
    public AddStudentResponse(long id) {
        this.id = id;
    }

    long getId() {
        return id;
    }
    void setId(long id) {
        this.id = id;
    }
}
