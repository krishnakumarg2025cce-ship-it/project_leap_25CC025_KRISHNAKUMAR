package com.example.project_leap_25cc025_krishnakumar.repository;

import com.example.project_leap_25cc025_krishnakumar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Student, Long> {

}
