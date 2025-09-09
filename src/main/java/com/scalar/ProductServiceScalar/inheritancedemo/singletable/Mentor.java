package com.scalar.ProductServiceScalar.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    private String companyName;
    private Double avgRating;
}
