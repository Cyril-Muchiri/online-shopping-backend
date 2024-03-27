package io.github.example.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.example.inventoryservice.entity.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory,String>{

    Optional<Inventory> findByProductCode(String productCode);
    
}
