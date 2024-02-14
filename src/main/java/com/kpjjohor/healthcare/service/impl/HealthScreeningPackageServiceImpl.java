package com.kpjjohor.healthcare.service.impl;

import java.util.List;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public List<HealthScreeningPackage> getAllPackages() {
        return packageRepository.findAll();
    }

    @SuppressWarnings("null")
	@Override
    public HealthScreeningPackage getPackageById(@NonNull Long packageId) {
        return packageRepository.findById(packageId)
            .orElseThrow();
    }

    @SuppressWarnings("null")
	@Override
    public HealthScreeningPackage savePackage(HealthScreeningPackage healthScreeningPackage) {
        return packageRepository.save(healthScreeningPackage);
    }

    @Override
    public void deactivatePackage(Long packageId) {
        @SuppressWarnings("null")
		HealthScreeningPackage healthScreeningPackage = getPackageById(packageId);
        healthScreeningPackage.setActive(false);
        packageRepository.save(healthScreeningPackage);
    }
}