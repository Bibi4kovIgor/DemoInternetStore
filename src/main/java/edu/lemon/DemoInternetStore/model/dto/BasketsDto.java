package edu.lemon.DemoInternetStore.model.dto;

import java.time.Instant;
import java.util.UUID;

public record BasketsDto(
        String id,
        CustomersDto customer,
        ProductsDto product,
        double quantity,
        Instant createDate
) {}
