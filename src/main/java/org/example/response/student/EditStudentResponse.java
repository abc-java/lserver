package org.example.response.student;

public class EditStudentResponse {
    long id;
    public EditStudentResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
