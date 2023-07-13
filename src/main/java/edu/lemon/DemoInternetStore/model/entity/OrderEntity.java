package edu.lemon.DemoInternetStore.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder
public class OrderEntity {
    @NonNull private final CustomerEntity customerEntity;
    @NonNull private final ProductEntity productEntity;
    private int quantity;
    @NonNull private final Instant orderDate;
}
