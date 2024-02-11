package com.kpjjohor.healthcare.repository;

import com.kpjjohor.healthcare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Add custom query methods if needed
}
