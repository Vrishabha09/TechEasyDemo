package com.TechEasyDemo.StudentSubject.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Student {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String name;
	 private String address;

	 @ManyToMany
	 @JoinTable(name = "student_subject",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "subject_id")
	    )
	 private Set<Subject> subjects = new HashSet<>();

	public List<Student> getSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

	    // Getters and setters
}




