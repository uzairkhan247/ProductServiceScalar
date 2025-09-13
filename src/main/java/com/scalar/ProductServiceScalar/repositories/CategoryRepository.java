package com.scalar.ProductServiceScalar.repositories;

import com.scalar.ProductServiceScalar.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(String name);
    //select * from categories where name = ?

    @Override
    Category save(Category category);
}
