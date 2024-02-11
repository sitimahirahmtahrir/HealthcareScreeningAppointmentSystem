package com.kpjjohor.healthcare.model;

import javax.persistence.*;

@Entity
public class HealthScreeningPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String packageName;
    private String description;
    private final double price;
    private boolean active;

    // Constructors, getters, and setters

    public HealthScreeningPackage() {
		this.price = 0;
        // Default constructor
    }

    // Other methods, if any

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

    // Getters and setters for other fields
}
