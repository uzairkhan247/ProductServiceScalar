package com.scalar.ProductServiceScalar.repositories;

import com.scalar.ProductServiceScalar.models.Product;
import com.scalar.ProductServiceScalar.projections.ProductWithTitleAndPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    @Override
    Product save(Product product);

    @Override
    void deleteById(Long aLong);

    //select title, price from products where id = 10;
    //HQL -> Hibernate Query Language
    //Based On the models.
    //@Query("select p.title as title, p.price as price from Product p where p.title = :title and p.price = :price")
    //List<ProductWithTitleAndPrice> getProductTitleAndPrice(String title, Double price);

    //Native Query = SQL Query
    @Query(value = "select p.title, p.price from products p where p.title = :title and p.price = :price", nativeQuery = true)
    List<ProductWithTitleAndPrice> getProductTitleAndPriceSQL(String title, Double price);

    //SQL -> Native Query
}
