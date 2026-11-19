# User Registration Application

A Java-based web application that allows users to register an account with form validation and MySQL database integration.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- MySQL
- Maven
- Jakarta Bean Validation
- HTML / CSS

## Features

- User registration form
- Form data binding using `@ModelAttribute`
- Server-side input validation using Jakarta Bean Validation
- Custom validation error messages
- User data persistence using Spring Data JPA
- MySQL database integration
- Automatic database schema updates using Hibernate

## Key Concepts

- **Spring MVC:** Handles HTTP requests and manages application flow.
- **Thymeleaf:** Renders dynamic HTML pages and binds form fields to Java objects.
- **Spring Data JPA:** Simplifies database operations through `JpaRepository`.
- **Bean Validation:** Validates user input using annotations such as `@NotBlank`, `@Size`, `@Email`, and `@Pattern`.

## Getting Started

### Run the Application

```bash
mvn spring-boot:run
```

Open your browser:

`http://localhost:8080/`



Spring Validation Implementation Steps

1. Add validation Annotation to the Entity field
2. Implement @Valid and BindingResult(Interface) to the method which is handling the request (in UserController)
@Valid is used to validate if the form fields are valid, BindingResult is used to store all the errors, think of BindingResult as a box
3. Bind the Entity Object and field
4. Add Error HTML tag with thymleaf