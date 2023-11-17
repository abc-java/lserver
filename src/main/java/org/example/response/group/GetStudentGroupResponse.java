package org.example.response.group;

import org.example.entity.GroupStudent;

import java.util.List;

public class GetStudentGroupResponse {
    private List<GroupStudent> groupStudentList;

    public GetStudentGroupResponse(List<GroupStudent> groupStudentList) {
        this.groupStudentList = groupStudentList;
    }

    List<GroupStudent> getGroupStudentList() {
        return groupStudentList;
    }

    void setGroupStudentList(List<GroupStudent> groupStudentList) {
        this.groupStudentList = groupStudentList;
    }
}
