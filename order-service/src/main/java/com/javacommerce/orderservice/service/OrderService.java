package com.javacommerce.orderservice.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.javacommerce.orderservice.model.OrderItems;
import com.javacommerce.orderservice.model.Order;

import com.javacommerce.orderservice.dto.OrderItemsDto;
import com.javacommerce.orderservice.dto.OrderRequest;
import com.javacommerce.orderservice.model.OrderItems;
import com.javacommerce.orderservice.repository.OrderRepository; 

public class OrderService{
    private final OrderRepository _orderRepository;
    private final WebClient.Builder webClientBuilder;
    private final ObservationRegistry observationRegistry;
    private final ApplicationEventPublisher applicationEventPublisher;

    private OrderItems mapToDto(OrderItemsDto OrderItemsDto) {
        OrderItems orderItems = new OrderItems();
        orderItems.setPrice(OrderItemsDto.getPrice());
        orderItems.setQuantity(OrderItemsDto.getQuantity());
        orderItems.setSkuCode(OrderItemsDto.getSkuCode());
        return orderItems;
    }

    public String placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderItems> orderItems = orderRequest.getOrderItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .toList();

        order.setOrderItemsList(orderItems);
        return orderItems;
}