package com.javacommerce.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="order_items_table")
public class OrderItems {
    @Id
    private Long id;
    private BigDecimal price;
    private Integer numberOfItems; 
    private String code;



}
