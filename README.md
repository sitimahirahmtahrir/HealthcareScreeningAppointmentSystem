# Healthcare Screening Appointment System

Project Overview
The Healthcare Screening Appointment System (HSAS) is designed to streamline the appointment and screening process for healthcare institutions. Built using the Spring MVC framework with Spring Boot, the application follows the Model-View-Controller (MVC) architecture. It leverages Spring JDBC for efficient database connectivity, ensuring smooth interactions with relational databases.

Modules
User Registration:

Description: Allows users to register for the system.
Role-based Access: All users.
Appointment Booking:

Description: Facilitates users in booking healthcare screening appointments.
Role-based Access: All users.
Patient Dashboard:

Description: Provides a dashboard for patients to view appointment status, screening reports, and payment details.
Role-based Access: Registered patients.
Admin Dashboard:

Description: Empowers administrators to manage packages, users, and appointment requests (approval and decline).
Role-based Access: Admin users.
Technologies Used
Java:

Core programming language.
Spring Boot:

Framework for building robust Java applications.
JPA/Hibernate:

ORM tools for data persistence.
Maven:

Dependency management and build tool.
Project Structure
src/main/java:

com.kpjjohor.healthcare.controller: Contains controllers for handling user requests.
com.kpjjohor.healthcare.model: Defines entities for the database.
com.kpjjohor.healthcare.repository: Manages database interactions.
com.kpjjohor.healthcare.service: Contains service classes for business logic.
com.kpjjohor.healthcare.exception: Handles exceptions and errors.
src/main/resources:

application.properties: Configures application-specific properties.
static/css/style.css: Holds CSS styles for the application.
src/main/webapp/WEB-INF/views:

Contains JSP files for different views.
Database Design
Entities:

User, Role, HealthScreeningPackage, Appointment, UserRole.
Relationships:

Many-to-One between Appointment and User.
Many-to-One between UserRole and User.
Database Code
Located in the repository layer (com.kpjjohor.healthcare.repository).
JSP File Integration with Java
Controllers (com.kpjjohor.healthcare.controller) handle user requests and interact with services.
Services (com.kpjjohor.healthcare.service) contain business logic, interacting with repositories.
Repositories (com.kpjjohor.healthcare.repository) handle database interactions.
Conclusion
The Healthcare Screening Appointment System aims to provide a user-friendly and dynamic experience for both patients and administrators. The use of Spring MVC with Spring Boot ensures a scalable and maintainable application, meeting modern healthcare appointment management needs.

## Setup
-Clone the repository:git clone https://github.com/your-username/HealthcareScreeningAppointmentSystem.git
-cd HealthcareScreeningAppointmentSystem
-Build the project:
 -mvn clean install
 -Run the application:
 -mvn spring-boot:run
 -Access the application at http://localhost:8080.
