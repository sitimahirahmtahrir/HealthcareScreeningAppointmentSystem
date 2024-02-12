package com.kpjjohor.healthcare.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    private User user;

    @ManyToOne
    @JoinColumn(name = "package_id")
    @NotNull
    private HealthScreeningPackage healthScreeningPackage;

    @Column(name = "appointment_date_time")
    @NotNull
    @Future
    private LocalDateTime appointmentDateTime;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @Column(name = "location")
    private String location;

    @Column(name = "notes")
    private String notes;

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    // Constructors, getters, setters, and other methods

    // Remove unused methods or fields as needed
}