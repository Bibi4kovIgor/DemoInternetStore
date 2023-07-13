package edu.lemon.DemoInternetStore.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductEntity {
    @NonNull private UUID id;
    @NonNull private String name;
    @NonNull private CategoryEntity categoryEntity;
    private int quantity;
    private BigDecimal price;
    @NonNull SupplierEntity supplierEntity;
    private String description;


}
