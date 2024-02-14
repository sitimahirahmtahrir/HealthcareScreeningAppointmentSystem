package com.kpjjohor.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showRegistrationForm() {
        // Add logic to display registration form
        return "registration"; // Assuming you have a registration.jsp file
    }

    // Add more methods for user-related actions
}
