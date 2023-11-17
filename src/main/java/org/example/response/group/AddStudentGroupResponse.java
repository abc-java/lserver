package org.example.response.group;

public class AddStudentGroupResponse {
    private long id;

    public AddStudentGroupResponse(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    void setId(long id) {
        this.id = id;
    }
}
