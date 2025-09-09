package com.scalar.ProductServiceScalar.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_instructors")
public class Instructor extends User {
    private String specialization;
    private Double avgRating;
}
