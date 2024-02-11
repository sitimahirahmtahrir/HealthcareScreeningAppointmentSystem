package com.kpjjohor.healthcare.service.impl;

import com.kpjjohor.healthcare.model.Appointment;
import com.kpjjohor.healthcare.repository.AppointmentRepository;
import com.kpjjohor.healthcare.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getPendingAppointments() {
        // Implementation for retrieving pending appointments
        return null;
    }

    @Override
    public void approveAppointment(Long appointmentId) {
        // Implementation for approving appointment
    }

    @Override
    public void rejectAppointment(Long appointmentId) {
        // Implementation for rejecting appointment
    }

    @Override
    public void saveAppointment(Appointment appointment) {
        // Implementation for saving appointment
    }

	public AppointmentRepository getAppointmentRepository() {
		return appointmentRepository;
	}
}
