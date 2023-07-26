package edu.lemon.DemoInternetStore.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder
public class OrderDto {
    @NonNull private final CustomerDto customerDto;
    @NonNull private final ProductDto productDao;
    private int quantity;
    @NonNull private final Instant orderDate;
}
