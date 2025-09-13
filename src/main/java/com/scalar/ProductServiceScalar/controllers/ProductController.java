package com.scalar.ProductServiceScalar.controllers;

import com.scalar.ProductServiceScalar.exceptions.ProductNotFoundException;
import com.scalar.ProductServiceScalar.models.Product;
import com.scalar.ProductServiceScalar.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

    //http://localhost:8080/products/1
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) throws ProductNotFoundException{
        /*ResponseEntity<Product> responseEntity = null;
        try{
            Product product = productService.getProductById(id);
            responseEntity = new ResponseEntity<>(
                    product,
                    HttpStatus.NOT_FOUND
            );
        }catch (ProductNotFoundException e) {
            responseEntity = new ResponseEntity<>(
                    null,
                    HttpStatus.BAD_REQUEST
            );
        }
        return responseEntity;*/
        return productService.getProductById(id);
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){

        return productService.createProduct(product);
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return product;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product) throws ProductNotFoundException {

        return productService.replaceProduct(id,product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }


    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException e) {
        return new ResponseEntity<>(
                e.getMessage(),
                HttpStatus.SERVICE_UNAVAILABLE
        );
    }
}
