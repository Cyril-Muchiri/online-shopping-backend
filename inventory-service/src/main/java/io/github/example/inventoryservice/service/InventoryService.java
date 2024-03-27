package io.github.example.inventoryservice.service;

import java.util.List;

import io.github.example.inventoryservice.model.InventoryCreateDto;
import io.github.example.inventoryservice.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);

    Boolean checkInventory(List<String> productCodes, List<Integer> productQuantities);
    
}
