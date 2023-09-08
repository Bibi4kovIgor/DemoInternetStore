package edu.lemon.DemoInternetStore.controller.services;

import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomersService {
    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public Optional<CustomersDto> getUserInfoByName(String name) {
        return customersRepository.findByFirstName(name);
    }

    public Optional<CustomersDto> getCustomerByFirstName(String name){
        return customersRepository.findByFirstName(name);
    }
}
