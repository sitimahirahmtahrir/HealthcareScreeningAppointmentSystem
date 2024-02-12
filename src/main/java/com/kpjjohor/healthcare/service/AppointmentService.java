package com.kpjjohor.healthcare.service;

import com.kpjjohor.healthcare.model.Appointment;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface AppointmentService {

    void saveAppointment(Appointment appointment);

    List<Appointment> getPendingAppointments();

    void approveAppointment(Long appointmentId);

    void rejectAppointment(Long appointmentId);

	void cancelAppointment(Long appointmentId);

	Map<LocalDate, List<Appointment>> getSchedule(Long medicalProfessionalId);
}
