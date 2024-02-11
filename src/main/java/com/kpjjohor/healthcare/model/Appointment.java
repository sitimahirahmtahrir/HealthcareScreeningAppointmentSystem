package com.kpjjohor.healthcare.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private HealthScreeningPackage healthScreeningPackage;

    @Column(name = "appointment_date_time")
    private LocalDateTime appointmentDateTime;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    // Constructors, getters, setters, and other methods

    // Remove unused methods or fields as needed
}
