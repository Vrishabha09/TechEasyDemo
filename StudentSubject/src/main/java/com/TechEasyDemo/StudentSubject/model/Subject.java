package com.TechEasyDemo.StudentSubject.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Subject {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	
    private String name;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();

    // Getters and setters

}



