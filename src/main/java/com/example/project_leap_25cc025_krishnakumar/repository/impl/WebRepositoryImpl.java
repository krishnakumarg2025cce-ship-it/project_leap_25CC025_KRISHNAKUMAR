package com.example.project_leap_25cc025_krishnakumar.repository.impl;

import com.example.project_leap_25cc025_krishnakumar.repository.WebRepository;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Repository
public class WebRepositoryImpl implements WebRepository {
    @Override
    public String writeData(String data) {
        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write(data);

            writer.close();

            return "Data written successfully!";
        } catch (IOException e) {
            return "An error occurred: " + e.getMessage();
        }

    }
    @Override
    public String readData() {
        try {
            return Files.readString(Paths.get("data.txt"));
        }
        catch(IOException e){
            return "An error occurred: " + e.getMessage();
        }
    }
}



