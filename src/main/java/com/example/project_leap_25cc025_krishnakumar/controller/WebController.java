package com.example.project_leap_25cc025_krishnakumar.controller;

import com.example.project_leap_25cc025_krishnakumar.services.WebServices;
import com.example.project_leap_25cc025_krishnakumar.services.impl.WebServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    WebServices webServices;
    @PostMapping("data/write")
    String writeData(String data)
    {
        return webServices.writeData(data);
    }
    @GetMapping("data/get")
    String getData()
    {

        return webServices.readData();
    }
}
