package com.skillsoft.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillsoft.springboot.model.Product;
import com.skillsoft.springboot.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllTopics(){
		
		return productService.getAllProducts();
	/*public List<Product> getAllProducts(){
		
		return Arrays.asList(
				new Product("P101", "Monitor", "Electronics"),
				new Product("P102", "Blanket", "Household"),
				new Product("P103", "Laptop", "Electronics"),
				new Product("P104", "Shirt", "Fashion"),
				new Product("P105", "Pens", "School"));*/
	}
	
	/*@GetMapping(value = "/products/{pId}")
	public Product getProduct(@PathVariable("pId") String id) {
		Product product = productService.getProduct(id);
		System.out.println(product);
		return product;
	}*/
	//read operations
	@GetMapping("/products/{pId}")
	public Product getProduct(@PathVariable("pId") String id) {
		return productService.getProduct(id);
	}
	
	//create operations
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		
	}
	
	//update operations
	@PutMapping("/products/{pId}")
	public void updateProduct(@RequestBody Product product,
			@PathVariable("pId") String id) {
		productService.updateProduct(id, product);
		
	}

	@DeleteMapping("/products/{pId}")
	public void deleteProduct(@PathVariable("pId") String id) {
		
		productService.deleteProduct(id);
	}

}
