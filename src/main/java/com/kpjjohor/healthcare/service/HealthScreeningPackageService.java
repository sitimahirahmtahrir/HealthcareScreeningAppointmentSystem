package com.kpjjohor.healthcare.service;

import com.kpjjohor.healthcare.model.HealthScreeningPackage;

import java.util.List;

public interface HealthScreeningPackageService {

    List<HealthScreeningPackage> getAllPackages();

    HealthScreeningPackage getPackageById(Long packageId);

    void savePackage(HealthScreeningPackage healthScreeningPackage);

    void deactivatePackage(Long packageId);
}
