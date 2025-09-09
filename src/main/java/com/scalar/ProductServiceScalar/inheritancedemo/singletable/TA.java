package com.scalar.ProductServiceScalar.inheritancedemo.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "3")
public class TA extends User {
    private int numberOfHR;
}
