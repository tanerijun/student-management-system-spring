package com.tanerijun.studentmanagementsystem.service;

import com.tanerijun.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    void saveStudent(Student student);
    void deleteStudent(Long id);
}
