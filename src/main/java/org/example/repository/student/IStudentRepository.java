package org.example.repository.student;

import org.example.entity.Student;
import org.example.request.student.*;

import java.util.List;

public interface IStudentRepository {
    long add(AddStudentRequest request);
    long edit(EditStudentRequest request);
    void delete(DeleteStudentRequest request);
    Student getById(GetStudentByIdRequest request);
    List<Student> getGroupStudent(GetStudentsByGroupRequest request);
}
