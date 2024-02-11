package com.kpjjohor.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentController {

    @GetMapping("/appointments")
    public String viewAppointments() {
        return "appointment-list";
    }

    // Add additional methods for appointment-related actions
}
