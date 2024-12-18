package com.TechEasyDemo.StudentSubject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.TechEasyDemo.StudentSubject.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}

