package com.scalar.ProductServiceScalar.services;

import com.scalar.ProductServiceScalar.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId);
    List<Product> getAllProducts();
}
