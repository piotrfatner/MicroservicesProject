package com.example.inventoryService.service;

import com.example.inventoryService.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Transactional
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode().isPresent();
    }
}
