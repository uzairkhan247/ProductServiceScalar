package com.scalar.ProductServiceScalar.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="categories")
public class Category extends BaseModel{
    @Column(unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        //@OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
// can only be present in OneToMany side.
   //private List<Product> products;
}
