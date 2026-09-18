package com.example.project_leap_25cc025_krishnakumar.services.impl;

import com.example.project_leap_25cc025_krishnakumar.model.Student;
import com.example.project_leap_25cc025_krishnakumar.repository.WebRepository;
import com.example.project_leap_25cc025_krishnakumar.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServiceImpl implements WebServices {
    @Autowired
    private WebRepository webRepository;

    @Override
    public Student saveStudent(Student student) {
        return webRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        webRepository.deleteById(id);
    }

    @Override
    public List<Student> readStudents() {
        return webRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return webRepository.save(student);
    }

}