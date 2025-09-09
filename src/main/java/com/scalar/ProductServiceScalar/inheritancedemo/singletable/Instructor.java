package com.scalar.ProductServiceScalar.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "1")
public class Instructor extends User {
    private String specialization;
    private Double avgRating;
}
