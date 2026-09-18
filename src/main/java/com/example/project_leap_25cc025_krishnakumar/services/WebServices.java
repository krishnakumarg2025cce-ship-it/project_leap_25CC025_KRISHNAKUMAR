package com.example.project_leap_25cc025_krishnakumar.services;

import com.example.project_leap_25cc025_krishnakumar.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WebServices {
    Student saveStudent(Student student);
    void deleteStudent(long id);
    List<Student> readStudents();
    Student updateStudent(Student student);
}
