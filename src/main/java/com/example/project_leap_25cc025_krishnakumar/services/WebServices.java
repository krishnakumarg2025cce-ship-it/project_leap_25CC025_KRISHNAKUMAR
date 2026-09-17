package com.example.project_leap_25cc025_krishnakumar.services;

import org.springframework.stereotype.Service;

@Service
public interface WebServices {
    String writeData(String text);
    String readData();
}
