package com.scalar.ProductServiceScalar.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO INCREMENT
    private Long id;
    //private Date createdAt;
    //private Date lastModifiedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    /*
MappedSuperClass - No table for BaseModel class, but all the attrs of BaseModel
will be present all the child class tables.
 */
}
