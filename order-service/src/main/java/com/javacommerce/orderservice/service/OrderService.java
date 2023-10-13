package com.javacommerce.orderservice.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.javacommerce.orderservice.model.OrderItems;
import com.javacommerce.orderservice.model.Order;

import com.javacommerce.orderservice.dto.OrderItemsDto;
import com.javacommerce.orderservice.model.OrderItems;
import com.javacommerce.orderservice.repository.OrderRepository; 

public class OrderService{
    private final OrderRepository _orderRepository;

    private OrderItems mapToDto(OrderItemsDto OrderItemsDto) {
        OrderItems orderItems = new OrderItems();
        orderItems.setPrice(OrderItemsDto.getPrice());
        orderItems.setQuantity(OrderItemsDto.getQuantity());
        orderItems.setSkuCode(OrderItemsDto.getSkuCode());
        return orderItems;
    }

    public OrderService(OrderRepository orderRepository){
        orderRepository = _orderRepository;
    }
}