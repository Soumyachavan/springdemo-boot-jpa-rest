package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	

	

}
