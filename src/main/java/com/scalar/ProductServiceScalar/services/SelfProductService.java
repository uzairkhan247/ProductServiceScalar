package com.scalar.ProductServiceScalar.services;

import com.scalar.ProductServiceScalar.exceptions.ProductNotFoundException;
import com.scalar.ProductServiceScalar.models.Product;
import com.scalar.ProductServiceScalar.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("selfProductService")
//@Primary
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(Long productId) throws ProductNotFoundException{
        //make a DB call to get the product with given Id.
        //select * from products where id = ?

        Optional<Product> optionalProduct = productRepository.findById(productId);

        if (optionalProduct.isEmpty()) {
            throw new ProductNotFoundException("Product with id: " + productId + " doesn't exist.");
        }

        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        return products;
    }
}
