package edu.lemon.DemoInternetStore.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductDto {
    @NonNull private UUID id;
    @NonNull private String name;
    @NonNull private CategoryDto categoryDao;
    private int quantity;
    private BigDecimal price;
    @NonNull SupplierDto supplierDto;
    private String description;
}
