package io.github.example.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.example.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
    
}
