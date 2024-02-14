package com.kpjjohor.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("/patient/dashboard")
    public String patientDashboard() {
        // Add logic to retrieve and display patient dashboard
        return "patient_dashboard"; // Assuming you have a patient_dashboard.jsp file
    }

    @GetMapping("/patient/appointments")
    public String patientAppointments() {
        // Add logic to retrieve and display patient appointments
        return "patient_appointments"; // Assuming you have a patient_appointments.jsp file
    }

    // Add more methods for patient-related actions
}
