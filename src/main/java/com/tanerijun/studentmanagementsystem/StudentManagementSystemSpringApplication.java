package com.tanerijun.studentmanagementsystem;

import com.tanerijun.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentManagementSystemSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemSpringApplication.class, args);
    }

}
