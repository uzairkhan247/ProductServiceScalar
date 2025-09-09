package com.scalar.ProductServiceScalar.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_mentors")
public class Mentor extends User {
    private String companyName;
    private Double avgRating;
}
