package edu.lemon.DemoInternetStore.controller.services;

import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.entity.CustomersEntity;
import edu.lemon.DemoInternetStore.model.repositories.CustomersReadRepository;
import edu.lemon.DemoInternetStore.model.repositories.CustomersModifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static edu.lemon.DemoInternetStore.utils.DtoToEntity.customerDtoToEntity;

@Service
public class CustomersService {
    @Autowired
    CustomersReadRepository customersReadRepository;
    @Autowired
    CustomersModifyRepository customersModifyRepository;
    public Optional<CustomersDto> getUserInfoByName(String name) {
        return customersReadRepository.findByFirstName(name);
    }

    public Optional<CustomersDto> getCustomerByFirstName(String name){
        return customersReadRepository.findByFirstName(name);
    }
}
