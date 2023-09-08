package edu.lemon.DemoInternetStore.utils;

import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.entity.CustomersEntity;
import edu.lemon.DemoInternetStore.model.entity.ProductsEntity;

public class DtoToEntity {
    public static CustomersEntity customerDtoToEntity(CustomersDto customersDto) {
        return CustomersEntity.builder()
                .login(customersDto.login())
                .phone(customersDto.phone())
                .birthDate(customersDto.birthDate())
                .email(customersDto.email())
                .password(customersDto.password())
                .firstName(customersDto.firstName())
                .lastName(customersDto.lastName())
                .build();
    }

    public static ProductsEntity productDtoToEntity(ProductsDto productsDto) {
        return ProductsEntity.builder()
                .name(productsDto.name())
                .price(productsDto.price())
                .description(productsDto.description())
                .quantity(productsDto.quantity())
                .vendorCode(productsDto.vendorCode())
                .build();
    }
}
