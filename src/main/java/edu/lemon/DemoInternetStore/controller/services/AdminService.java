package edu.lemon.DemoInternetStore.controller.services;

import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.entity.CustomersEntity;
import edu.lemon.DemoInternetStore.model.entity.ProductsEntity;
import edu.lemon.DemoInternetStore.model.repositories.CustomersModifyRepository;
import edu.lemon.DemoInternetStore.model.repositories.ProductsModifyRepository;
import org.springframework.stereotype.Service;

import static edu.lemon.DemoInternetStore.utils.DtoToEntity.customerDtoToEntity;
import static edu.lemon.DemoInternetStore.utils.DtoToEntity.productDtoToEntity;

@Service
public class AdminService {


    private final CustomersModifyRepository customersModifyRepository;
    private final ProductsModifyRepository productsModifyRepository;

    public AdminService(CustomersModifyRepository customersModifyRepository, ProductsModifyRepository productsModifyRepository) {
        this.customersModifyRepository = customersModifyRepository;
        this.productsModifyRepository = productsModifyRepository;
    }

    public void addNewCustomer(CustomersDto customersDto) {
        CustomersEntity customersEntity = customerDtoToEntity(customersDto);
        customersModifyRepository.save(customersEntity);
    }

    public void addProduct(ProductsDto productsDto) {
        // TODO: add request to obtain supplier
        ProductsEntity productsEntity = productDtoToEntity(productsDto);
        productsModifyRepository.save(productsEntity);
    }

}
