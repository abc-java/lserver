package org.example.request.student;

public class DeleteStudentRequest {
    private final long id;

    public DeleteStudentRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
