package com.javacommerce.inventoryservice.service;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.javacommerce.inventoryservice.dto.InventoryRequest;
import com.javacommerce.inventoryservice.repository.InventoryRepository;
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    @Transactional(readOnly = true)
    @SneakyThrows
    public List<InventoryRequest> isInStock(List<String> barCode) {
        log.info("Checking Inventory");
        return inventoryRepository.findBybarCodeIn(barCode).stream()
                .map(inventory ->
                        InventoryRequest.builder()
                                .barCode(inventory.getbarCode())
                                .isInStock(inventory.getQuantity() > 0)
                                .build()
                ).toList();
    }
}
