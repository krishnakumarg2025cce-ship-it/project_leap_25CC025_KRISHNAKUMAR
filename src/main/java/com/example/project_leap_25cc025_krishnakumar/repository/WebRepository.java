package com.example.project_leap_25cc025_krishnakumar.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository {
    String writeData(String data);
    String readData();
}
