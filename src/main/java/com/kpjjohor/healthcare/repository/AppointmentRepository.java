package com.kpjjohor.healthcare.repository;

import com.kpjjohor.healthcare.model.Appointment;
import com.kpjjohor.healthcare.model.AppointmentStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Page<Appointment> findByStatus(AppointmentStatus status, Pageable pageable);

    List<Appointment> findByUserAndStatusNot(Long userId, AppointmentStatus status);

    Optional<Appointment> findById(Long id);

    // Add other custom query methods if needed
}