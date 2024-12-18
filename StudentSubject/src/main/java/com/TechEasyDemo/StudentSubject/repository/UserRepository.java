package com.TechEasyDemo.StudentSubject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TechEasyDemo.StudentSubject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

