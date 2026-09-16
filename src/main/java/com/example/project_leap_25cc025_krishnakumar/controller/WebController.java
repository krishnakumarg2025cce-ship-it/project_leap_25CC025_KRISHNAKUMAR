package com.example.project_leap_25cc025_krishnakumar.controller;

import com.example.project_leap_25cc025_krishnakumar.model.location;
import com.example.project_leap_25cc025_krishnakumar.model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/Calculate")
    int Calculate(int a, int b, String operation) {
        switch (operation) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;

            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
        }
    }

    @GetMapping("/student")
    public student getStudent() {
        student Student = new student();
        Student.setName("Krish");
        Student.setDepartment("CCE");
        Student.setRollno("25025");
        return Student;
    }
    @GetMapping("/location")
    public location getLocation() {}
}