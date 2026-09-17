package com.example.project_leap_25cc025_krishnakumar.services.impl;

import com.example.project_leap_25cc025_krishnakumar.repository.WebRepository;
import com.example.project_leap_25cc025_krishnakumar.repository.impl.WebRepositoryImpl;
import com.example.project_leap_25cc025_krishnakumar.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebServices {
    @Autowired
    WebRepository webRepository;
    @Override
    public String writeData(String text) {
        return webRepository.writeData(text);
    }
    @Override
    public String readData(){
        return webRepository.readData();
    }
}