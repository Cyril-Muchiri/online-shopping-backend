package io.github.example.productservice.service;

import java.util.List;

import io.github.example.productservice.model.ProductCreateRequest;
import io.github.example.productservice.model.ProductCreateResponse;



public interface ProductService {

    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);

    List<ProductCreateResponse> findAll();

    ProductCreateResponse findById(Integer productId);
    
}
