package com.myapp.spring.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.model.Product;
import com.myapp.spring.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductApi{
	
	private ProductRepository repository;

	public ProductApi(ProductRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
	return new ResponseEntity<List<Product>>(repository.findAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(repository.save(product),HttpStatus.CREATED);
	}
	
	//@GetMapping("findByName/{name")
	//public ResponseEntity<List<Product>> searchByName(@path)
	
}