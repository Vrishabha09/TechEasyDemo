# TechEasyDemo

# Student Subject Management System

A Spring Boot-based web application for managing student subjects, built with Hibernate, JPA, and HikariCP.

---

## Features

- Manage students and their associated subjects.
- RESTful APIs for CRUD operations.
- Secured with Spring Security.
- Uses HikariCP for efficient database connection pooling.
- Follows JPA standards for database interaction.
- LiveReload enabled for development.

---

## Prerequisites

Before running this project, ensure you have:

- **Java 17** or later installed.
- **Maven** installed for dependency management.
- **MySQL/PostgreSQL** (or another database) configured.
- **Postman** or a similar API testing tool (optional, for testing the APIs).

---

## Getting Started

### 1. Clone the Repository

bash
git clone https://github.com/Vrishabha09/TechEasyDemo.git
cd TechEasyDemo

# Application properties
spring.application.name=StudentSubject

server.port=9090
# H2 database configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

# Hibernate configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect

# Optional: Enable H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console



