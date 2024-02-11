package com.kpjjohor.healthcare.model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Enumerated(EnumType.STRING)
    private UserRoleEnum name;  // <-- Add this enum type

    // Constructors, getters, setters
}
