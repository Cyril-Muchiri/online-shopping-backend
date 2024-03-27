package io.github.example.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.example.productservice.entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
