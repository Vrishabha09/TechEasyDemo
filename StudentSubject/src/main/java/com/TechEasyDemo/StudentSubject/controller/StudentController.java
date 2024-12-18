package com.TechEasyDemo.StudentSubject.controller;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.TechEasyDemo.StudentSubject.model.Student;
import com.TechEasyDemo.StudentSubject.model.Subject;
import com.TechEasyDemo.StudentSubject.repository.StudentRepository;
import com.TechEasyDemo.StudentSubject.repository.SubjectRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/{studentId}/subjects/{subjectId}")
    public Student enrollToSubject(@PathVariable Long studentId, @PathVariable Long subjectId) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
        Subject subject = subjectRepository.findById(subjectId).orElseThrow(() -> new RuntimeException("Subject not found"));
        student.getSubjects().addAll((Collection<? extends Student>) subject);
        return studentRepository.save(student);
    }
}

