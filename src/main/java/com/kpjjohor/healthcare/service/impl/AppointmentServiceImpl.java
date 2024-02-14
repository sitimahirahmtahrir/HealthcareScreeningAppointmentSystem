package com.kpjjohor.healthcare.service.impl;

import com.kpjjohor.healthcare.model.Appointment;
import com.kpjjohor.healthcare.service.AppointmentService;
import com.kpjjohor.healthcare.service.dao.AppointmentDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public abstract class AppointmentServiceImpl implements AppointmentService {

    private AppointmentDAO appointmentDAO;

    public AppointmentServiceImpl(AppointmentDAO appointmentDAO) {
        this.appointmentDAO = appointmentDAO;
    }

    public Appointment scheduleAppointment(Long medicalProfessionalId, LocalDate date, LocalTime time) {
        Appointment appointment = new Appointment();
        appointment.setMedicalProfessionalId(medicalProfessionalId);
        appointment.setDate(date);
        appointment.setTime(time);
        appointmentDAO.create(appointment);
        return appointment;
    }

    public void cancelAppointment(Long appointmentId) {
        Appointment appointment = appointmentDAO.findById(appointmentId);
        if (appointment != null) {
            appointmentDAO.delete(appointment);
        }
    }

    @Override
    public Map<LocalDate, List<Appointment>> getSchedule(Long medicalProfessionalId) {
        return appointmentDAO.findScheduleByMedicalProfessionalId(medicalProfessionalId);
    }
}