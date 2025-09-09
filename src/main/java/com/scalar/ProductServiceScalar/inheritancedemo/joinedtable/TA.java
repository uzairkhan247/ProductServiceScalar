package com.scalar.ProductServiceScalar.inheritancedemo.joinedtable;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {
    private int numberOfHR;
}
