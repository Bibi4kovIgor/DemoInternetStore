package edu.lemon.DemoInternetStore.model.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.Set;
import java.util.UUID;


@Builder
public record SuppliersDto(
        String id,
        @Size(min=2, max=30, message = "Organisation name must be from 2 to 30 chars")
        String organisationName,
        @Size(min=2, max=30, message = "Customer's name must be from 2 to 30 chars")
        String name,
        Set<ProductsDto> productsDtos,
        @Digits(message = "Digits only!", integer = 10, fraction = 0)
        Long taxId,
        @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong Email format")
        String email,
        @Pattern(regexp = " ^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",
                message = "Phone format is incorrect")
        String phone){}