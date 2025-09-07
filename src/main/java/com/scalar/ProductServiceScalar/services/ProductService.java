package com.scalar.ProductServiceScalar.services;

import com.scalar.ProductServiceScalar.exceptions.ProductNotFoundException;
import com.scalar.ProductServiceScalar.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId) throws ProductNotFoundException;;
    List<Product> getAllProducts();
}
