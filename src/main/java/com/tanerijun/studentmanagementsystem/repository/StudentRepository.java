package com.tanerijun.studentmanagementsystem.repository;

import com.tanerijun.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
