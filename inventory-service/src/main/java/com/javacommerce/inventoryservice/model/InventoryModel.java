package com.javacommerce.inventoryservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Document(value = "inventory")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class InventoryModel {
    @Id
    private String id; 
    private Integer quantity;
    private String BarCode; 
}
