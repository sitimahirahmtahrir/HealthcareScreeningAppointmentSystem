package com.kpjjohor.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {

    @GetMapping("/appointments")
    public String viewAppointments() {
        // Add logic to retrieve and display appointments
        return "appointments"; // Assuming you have an appointments.jsp file
    }

    @GetMapping("/book-appointment")
    public String bookAppointment() {
        // Add logic for booking appointments
        return "book_appointment"; // Assuming you have a book_appointment.jsp file
    }

    // Add more methods for appointment-related actions
}
