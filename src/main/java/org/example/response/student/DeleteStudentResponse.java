package org.example.response.student;

public class DeleteStudentResponse {
    private long id;
    public DeleteStudentResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
