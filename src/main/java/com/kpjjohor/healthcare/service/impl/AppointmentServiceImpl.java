package com.kpjjohor.healthcare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kpjjohor.healthcare.exception.EntityNotFoundException;
import com.kpjjohor.healthcare.model.Appointment;
import com.kpjjohor.healthcare.model.AppointmentStatus;
import com.kpjjohor.healthcare.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> findAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment findAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Appointment not found with ID: " + id));
    }

    @SuppressWarnings("unchecked")
	public List<Appointment> findAppointmentsByStatus(AppointmentStatus status) {
        Pageable pageable = PageRequest.of(0, 10);
        return (List<Appointment>) appointmentRepository.findByStatus(status, pageable);
    }

    public Appointment updateAppointmentStatus(Long id, AppointmentStatus status) {
        Appointment appointment = findAppointmentById(id);
        appointment.setStatus(status);
        return appointmentRepository.save(appointment);
    }
}