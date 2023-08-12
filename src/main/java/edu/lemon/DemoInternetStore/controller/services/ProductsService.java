package edu.lemon.DemoInternetStore.controller.services;

import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.repositories.ProductsReadRepository;
import edu.lemon.DemoInternetStore.utils.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsReadRepository productsReadRepository;

    public List<ProductsDto> getProductByName(String name) {
        return productsReadRepository.findByNameContaining(name);
    }


    // TODO: Only for test purposes -> will be removed
    public List<ProductsDto> getAllProducts() {
        return productsReadRepository.findAll().stream()
                .map(EntityToDto::productEntityToDto)
                .toList();
    }



}
