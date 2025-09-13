package com.scalar.ProductServiceScalar.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="categories")
public class Category extends BaseModel{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    @OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
// can only be present in OneToMany side.
//    private List<Product> products;
}
