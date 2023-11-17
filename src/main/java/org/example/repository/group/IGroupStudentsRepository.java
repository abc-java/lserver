package org.example.repository.group;

import org.example.entity.GroupStudent;
import org.example.entity.Student;
import org.example.request.group.*;
import org.example.request.student.AddStudentRequest;
import org.example.request.student.DeleteStudentRequest;
import org.example.request.student.EditStudentRequest;

import java.util.List;

public interface IGroupStudentsRepository {
    long add(AddStudentGroupRequest request);
    long edit(EditStudentGroupRequest request);
    void delete(DeleteStudentGroupRequest request);
    GroupStudent getById(GetStudentGroupByIdRequest request);
    List<GroupStudent> getAllGroup(GetStudentGroupRequest request);
}
