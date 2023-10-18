package com.javacommerce.inventoryservice.repository;
import com.javacommerce.inventoryservice.model.InventoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<InventoryModel, String> {
}