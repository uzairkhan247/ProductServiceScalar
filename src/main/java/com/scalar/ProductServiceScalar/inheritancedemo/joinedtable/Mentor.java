package com.scalar.ProductServiceScalar.inheritancedemo.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private String companyName;
    private Double avgRating;
}
