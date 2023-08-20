package edu.lemon.DemoInternetStore.controller.services;

import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.repositories.ProductsRepository;
import edu.lemon.DemoInternetStore.utils.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductsDto> getProductByName(String name) {
        return productsRepository.findByNameContaining(name);
    }


    // TODO: Only for test purposes -> will be removed
    public List<ProductsDto> getAllProducts() {
        return productsRepository.findAll().stream()
                .map(EntityToDto::productEntityToDto)
                .toList();
    }



}
