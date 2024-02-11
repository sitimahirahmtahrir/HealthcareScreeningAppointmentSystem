# Healthcare Screening Appointment System

## Project Overview
This project is a Java-based Healthcare Screening Appointment System designed to manage health screening appointments efficiently. It incorporates user roles, appointment scheduling, and health screening package management.

## Project Details
- **Course:** Internet Programming
- **Program:** Bachelor of Computer Science (Software Engineering)
- **Course Lecturer(s):** Mr. Norizam Bin Katmon
- **Student Name :
     - Siti Mahirah binti M Tahrir (SX142509CSJF01)
     - RAMAKRISHNA A/L MARIAPPAN (SX171156CSJS04)

## Project Requirements
- **Framework:** Spring MVC with Spring Boot
- **Architecture:** Implement the Model-View-Controller (MVC) architecture
- **Database Connectivity:** Use Spring JDBC for database connectivity
- **Modules:** Minimum of 4 modules with role-based access

## Features
- **User Roles:** Differentiate between users with distinct roles to control system access.
- **Appointment Scheduling:** Allow users to schedule healthcare screening appointments.
- **Health Screening Packages:** Manage various health screening packages offered by the system.

## Technologies Used
- Java: Core programming language.
- Spring Boot: Framework for building robust Java applications.
- JPA/Hibernate: ORM tools for data persistence.
- Maven: Dependency management and build tool.

## Modules
1. **User Registration and Authentication Module:**
   - Allow users to register and log in.
   - Implement role-based authentication (e.g., user, admin).
   - Only administrators (APPROVER roles) should have access to the approval and configuration functionalities.

2. **Appointment Booking Module:**
   - Users can book healthcare screening appointments.
   - Include a form to select from a list of predefined health screening packages.
   - store booked appointments in the database.

3. **Appointment Approval Module:**
   - Approvers (administrators) have access to a dashboard showing pending appointments.
   - Allow administrators to approve or reject appointments.
   - Include a status (e.g., pending, approved, rejected) for each appointment.

4. **Configuration Module:**
   - only accessible to administrators (APPROVER role).
   - Include the ability to activate or deactivate specific health screening packages.
   - Provide a simple interface to manage other configurable elements (e.g., promotions).

## Setup
-Clone the repository:git clone https://github.com/your-username/HealthcareScreeningAppointmentSystem.git
-cd HealthcareScreeningAppointmentSystem
-Build the project:
 -mvn clean install
 -Run the application:
 -mvn spring-boot:run
 -Access the application at http://localhost:8080.
