package com.kpjjohor.healthcare.repository;

import com.kpjjohor.healthcare.model.HealthScreeningPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthScreeningPackageRepository extends JpaRepository<HealthScreeningPackage, Long> {
    // You can add custom queries or methods here if needed
}
