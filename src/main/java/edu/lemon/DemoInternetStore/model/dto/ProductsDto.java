package edu.lemon.DemoInternetStore.model.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Builder
public record ProductsDto(
        String id,
        @Size(min=2, max=30, message = "Product name must be from 2 to 30 chars")
        String name,
        @Min(value = 1, message = "Products quantity should be more than 0")
        double quantity,
        @Min(value = 1, message = "Products price should be more than 0")
        BigDecimal price,

        @Min(value = 1, message = "Products price should be more than 0")
        String vendorCode,
        @Nullable String description) {}
