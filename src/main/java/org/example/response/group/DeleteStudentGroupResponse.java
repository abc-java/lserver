package org.example.response.group;

public class DeleteStudentGroupResponse {
    private long id;
    public DeleteStudentGroupResponse(long id) {
        this.id = id;
    }

    long getId() {
        return id;
    }
    void setId(long id) {
        this.id = id;
    }
}
