package com.javacommerce.orderservice.repository;

import com.javacommerce.orderservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Order, String> {
}
