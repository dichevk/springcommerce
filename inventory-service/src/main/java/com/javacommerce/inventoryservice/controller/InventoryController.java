package com.javacommerce.inventoryservice.controller;

import com.javacommerce.inventoryservice.dto.InventoryResponse;
import com.javacommerce.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> barCode) {
        log.info("Received inventory check request for barCode: {}", barCode);
        return inventoryService.isInStock(barCode);
    }
}