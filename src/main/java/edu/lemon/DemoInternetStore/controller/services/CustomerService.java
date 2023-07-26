package edu.lemon.DemoInternetStore.controller.services;

import edu.lemon.DemoInternetStore.model.dto.CustomerDto;
import edu.lemon.DemoInternetStore.model.entity.CustomerEntity;
import edu.lemon.DemoInternetStore.model.repositories.CustomerRepository;
import edu.lemon.DemoInternetStore.utils.EntityToDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public Optional<CustomerDto> getUserInfoByName(String name) {
        Optional<CustomerEntity> optionalCustomerEntity = customerRepository.findByFirstName(name);
        return optionalCustomerEntity.map(EntityToDao::customerEntityToCustomerDao);
    }
}
