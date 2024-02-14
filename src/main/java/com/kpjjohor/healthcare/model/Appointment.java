package com.kpjjohor.healthcare.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

	private LocalDate appointmentDate;

	private LocalTime appointmentTime;

    public Appointment() {}

    public Appointment(User user, HealthScreeningPackage healthScreeningPackage, LocalDateTime appointmentDateTime) {
        this.user = user;
        this.healthScreeningPackage = healthScreeningPackage;
        this.appointmentDateTime = appointmentDateTime;
        this.status = AppointmentStatus.PENDING;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public HealthScreeningPackage getHealthScreeningPackage() { return healthScreeningPackage; }

    public void setHealthScreeningPackage(HealthScreeningPackage healthScreeningPackage) { this.healthScreeningPackage = healthScreeningPackage; }

    public LocalDateTime getAppointmentDateTime() { return appointmentDateTime; }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) { this.appointmentDateTime = appointmentDateTime; }

    public AppointmentStatus getStatus() { return status; }

    public void setStatus(AppointmentStatus status) { this.status = status; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getNotes() { return notes; }

    public void setNotes(String notes) { this.notes = notes; }

    public LocalDate getDate() {
        return appointmentDateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return appointmentDateTime.toLocalTime();
    }

    public void setMedicalProfessionalId(long medicalProfessionalId) {
        // You can implement the logic to set the medical professional's id here
    }

    public long getMedicalProfessionalId() {
        // You can implement the logic to get the medical professional's id here
        return 0;
    }

    public void setDate(LocalDate date) {

        this.appointmentDate = date;

        this.appointmentDateTime = this.appointmentDate.atTime(this.appointmentTime);

    }


    public void setTime(LocalTime time) {

        this.appointmentTime = time;

        this.appointmentDateTime = this.appointmentDate.atTime(this.appointmentTime);

    }
    
}
	