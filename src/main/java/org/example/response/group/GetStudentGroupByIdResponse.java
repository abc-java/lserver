package org.example.response.group;

import org.example.entity.GroupStudent;

public class GetStudentGroupByIdResponse {
    public GroupStudent groupStudent;

    public GetStudentGroupByIdResponse(GroupStudent groupStudent) {
        this.groupStudent = groupStudent;
    }

    GroupStudent getGroupStudent() {
        return groupStudent;
    }

    void setGroupStudent(GroupStudent groupStudent) {
        this.groupStudent = groupStudent;
    }
}
