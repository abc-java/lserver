package org.example.response.group;

public class EditStudentGroupResponse {
    private long id;
    private String name;

    public EditStudentGroupResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    long getId() {
        return id;
    }
    String getName() {
        return name;
    }

    void setId(long id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
}
