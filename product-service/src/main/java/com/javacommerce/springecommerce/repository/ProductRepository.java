package com.javacommerce.springecommerce.repository;
import com.javacommerce.springecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}