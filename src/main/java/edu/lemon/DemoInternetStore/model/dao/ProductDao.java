package edu.lemon.DemoInternetStore.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductDao {
    @NonNull private UUID id;
    @NonNull private String name;
    @NonNull private CategoryDao categoryDao;
    private int quantity;
    private BigDecimal price;
    @NonNull SupplierDao supplierDao;
    private String description;
}
