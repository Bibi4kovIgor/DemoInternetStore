package edu.lemon.DemoInternetStore.model.repositories;

import edu.lemon.DemoInternetStore.model.entity.CustomerEntity;
import edu.lemon.DemoInternetStore.utils.MockedData;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepository {
    public Optional<CustomerEntity> getUserInfoByName(String firstName) {
        return  MockedData.customers.stream()
                        .filter(customer -> customer.getFirstName().equals(firstName))
                        .findFirst();

    }
}
