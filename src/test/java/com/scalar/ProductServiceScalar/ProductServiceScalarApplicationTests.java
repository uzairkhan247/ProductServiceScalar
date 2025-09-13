package com.scalar.ProductServiceScalar;

import com.scalar.ProductServiceScalar.projections.ProductWithTitleAndPrice;
import com.scalar.ProductServiceScalar.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceScalarApplicationTests {

	@Autowired
    private ProductRepository productRepository;
	@Test
	void contextLoads() {
		List<ProductWithTitleAndPrice> products =
                productRepository.getProductTitleAndPriceSQL("iPhone 13 Pro", 3210.0);

       for (ProductWithTitleAndPrice product : products) {
            System.out.println(product.getTitle() + " -> " + product.getPrice());
	   }
	}

}
