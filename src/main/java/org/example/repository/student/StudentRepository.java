package org.example.repository.student;

import org.example.entity.Student;
import org.example.request.student.*;

import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public long add(AddStudentRequest request) {
        System.out.println("addStudent");
        return 0;
    }

    @Override
    public long edit(EditStudentRequest request) {
        System.out.println("editStudent");
        return 0;
    }

    @Override
    public void delete(DeleteStudentRequest request) {
        System.out.println("deleteStudent");
    }

    @Override
    public Student getById(GetStudentByIdRequest request) {
        System.out.println("getByIdStudent");
        return null;
    }

    @Override
    public List<Student> getGroupStudent(GetStudentsByGroupRequest request) {
        System.out.println("getGroupStudent");
        return null;
    }
}
