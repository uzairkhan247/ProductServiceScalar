package com.scalar.ProductServiceScalar.inheritancedemo.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_tas")
public class TA extends User {
    private int numberOfHR;
}
