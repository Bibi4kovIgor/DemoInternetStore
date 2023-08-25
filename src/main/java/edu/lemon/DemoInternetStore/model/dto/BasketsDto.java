package edu.lemon.DemoInternetStore.model.dto;

import java.time.Instant;

public record BasketsDto(
        String id,
        CustomersDto customer,
        ProductsDto product,
        double quantity,
        Instant createDate
) {}
