package com.kpjjohor.healthcare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        // Add logic to retrieve and display admin dashboard
        return "admin_dashboard"; // Assuming you have an admin_dashboard.jsp file
    }

    // Add more methods for managing packages, users, etc.
}
