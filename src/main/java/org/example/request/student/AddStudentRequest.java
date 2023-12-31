package org.example.request.student;

import org.example.entity.GroupStudent;
import org.example.entity.StudentStatus;

public class AddStudentRequest {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final long groupId;
    private final String status;

    public AddStudentRequest(String lastName, String firstName, String middleName, long groupId, String status) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.groupId = groupId;
        this.status = status;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public long getGroupId() {
        return groupId;
    }

    public String getStatus() {
        return status;
    }
}
