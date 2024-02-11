package com.kpjjohor.healthcare.service;

import com.kpjjohor.healthcare.model.Appointment;

import java.util.List;

public interface AppointmentService {

    void saveAppointment(Appointment appointment);

    List<Appointment> getPendingAppointments();

    void approveAppointment(Long appointmentId);

    void rejectAppointment(Long appointmentId);
}
