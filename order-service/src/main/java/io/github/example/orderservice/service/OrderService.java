package io.github.example.orderservice.service;

import io.github.example.orderservice.model.OrderRequest;

public interface OrderService {

    String placeOrder(OrderRequest orderRequest);
    
}
