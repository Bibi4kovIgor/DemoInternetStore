package edu.lemon.DemoInternetStore.model.dto;

import lombok.Builder;

import java.time.Instant;
import java.util.UUID;

@Builder
public record OrdersDto(
        String id,
        CustomersDto customersDto,
        ProductsDto productDao,
        int quantity,
        Instant orderDate){}
