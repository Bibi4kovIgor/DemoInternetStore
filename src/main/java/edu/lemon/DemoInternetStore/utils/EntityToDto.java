package edu.lemon.DemoInternetStore.utils;

import edu.lemon.DemoInternetStore.model.dto.CategoriesDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.entity.CategoriesEntity;
import edu.lemon.DemoInternetStore.model.entity.ProductsEntity;

import java.util.stream.Collectors;

public class EntityToDto {

    public static ProductsDto productEntityToDto(ProductsEntity productsEntity) {
        return ProductsDto.builder()
                .price(productsEntity.getPrice())
                .quantity(productsEntity.getQuantity())
                .name(productsEntity.getName())
                .vendorCode(productsEntity.getVendorCode())
                .description(productsEntity.getDescription())
                .build();
    }

    public static CategoriesDto categoryEntityToDto(CategoriesEntity categoriesEntity) {
        return CategoriesDto.builder()
                .name(categoriesEntity.getName())
                .description(categoriesEntity.getDescription())
                .build();
    }

}
