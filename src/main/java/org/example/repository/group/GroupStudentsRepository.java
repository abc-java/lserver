package org.example.repository.group;

import org.example.entity.GroupStudent;
import org.example.entity.Student;
import org.example.entity.StudentStatus;
import org.example.request.group.*;

import java.util.ArrayList;
import java.util.List;

public class GroupStudentsRepository implements IGroupStudentsRepository{

    @Override
    public long add(AddStudentGroupRequest request) {
        System.out.println("addStudentGroup");
        return 0;
    }

    @Override
    public long edit(EditStudentGroupRequest request) {
        System.out.println("editStudentGroup");
        return 0;
    }

    @Override
    public void delete(DeleteStudentGroupRequest request) {
        System.out.println("deleteStudentGroup");
    }

    @Override
    public GroupStudent getById(GetStudentGroupByIdRequest request) {
        System.out.println("getByIdGroup");
        return null;
    }

    @Override
    public List<GroupStudent> getAllGroup(GetStudentGroupRequest request) {
        System.out.println("getAllGroup");

        return null;
    }
}
