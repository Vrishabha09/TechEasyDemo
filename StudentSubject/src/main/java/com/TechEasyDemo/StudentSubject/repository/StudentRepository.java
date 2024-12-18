package com.TechEasyDemo.StudentSubject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.TechEasyDemo.StudentSubject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}






