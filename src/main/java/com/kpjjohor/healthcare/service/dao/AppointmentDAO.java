package com.kpjjohor.healthcare.service.dao;

import com.kpjjohor.healthcare.model.Appointment;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface AppointmentDAO {

    void create(Appointment appointment);

    void delete(Appointment appointment);

    Appointment findById(Long id);

    Map<LocalDate, List<Appointment>> findScheduleByMedicalProfessionalId(Long medicalProfessionalId);
}