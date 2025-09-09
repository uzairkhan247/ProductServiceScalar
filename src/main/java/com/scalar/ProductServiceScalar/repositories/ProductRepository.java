package com.scalar.ProductServiceScalar.repositories;

import com.scalar.ProductServiceScalar.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long productId);
    //select * from products where id = productId

    @Override
    List<Product> findAll();
    //select * from products;
}
