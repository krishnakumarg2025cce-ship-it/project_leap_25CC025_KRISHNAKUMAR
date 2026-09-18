package com.example.project_leap_25cc025_krishnakumar.controller;

import com.example.project_leap_25cc025_krishnakumar.model.Student;
import com.example.project_leap_25cc025_krishnakumar.services.WebServices;
import com.example.project_leap_25cc025_krishnakumar.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private WebServices webServices;
    @PostMapping
    public Student addStudent(@RequestBody Student student) {

        return webServices.saveStudent(student);
    }
    @GetMapping
    public List<Student> getStudent(){
        return webServices.readStudents();
    }
}
