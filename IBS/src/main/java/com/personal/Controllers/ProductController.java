package com.personal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.EntityClasses.Product;
import com.personal.Repository.ProductRepository;


@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping(value = "/addProduct")
	public String addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return product.getPname();
				
	}
	
	@GetMapping(value = "/getProducts")
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}
