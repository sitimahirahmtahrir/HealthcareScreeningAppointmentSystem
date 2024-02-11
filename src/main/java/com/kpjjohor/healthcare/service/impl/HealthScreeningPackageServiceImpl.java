package com.kpjjohor.healthcare.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kpjjohor.healthcare.model.HealthScreeningPackage;
import com.kpjjohor.healthcare.repository.HealthScreeningPackageRepository;
import com.kpjjohor.healthcare.service.HealthScreeningPackageService;

@Service
public class HealthScreeningPackageServiceImpl implements HealthScreeningPackageService {

    private final HealthScreeningPackageRepository packageRepository;

    public HealthScreeningPackageServiceImpl(HealthScreeningPackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @Override
    public List<HealthScreeningPackage> getAllPackages() {
        return packageRepository.findAll();
    }

    @Override
    public HealthScreeningPackage getPackageById(Long packageId) {
        return packageRepository.findById(packageId)
                .orElseThrow(() -> new RuntimeException("Health Screening Package not found"));
    }

    @Override
    public void savePackage(HealthScreeningPackage healthScreeningPackage) {
        packageRepository.save(healthScreeningPackage);
    }

    @Override
    public void deactivatePackage(Long packageId) {
        HealthScreeningPackage healthScreeningPackage = getPackageById(packageId);
        healthScreeningPackage.setActive(false); // Assuming you have a setActive method in your HealthScreeningPackage class
        packageRepository.save(healthScreeningPackage);
    }
}
