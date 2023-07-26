package edu.lemon.DemoInternetStore.model.repositories;

import edu.lemon.DemoInternetStore.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
    Optional<CustomerEntity> findByFirstName(String firstName);

}

//public class CustomerRepository {
//    public Optional<CustomerEntity> getUserInfoByName(String firstName) {
//        return  MockedData.customers.stream()
//                        .filter(customer -> customer.getFirstName().equals(firstName))
//                        .findFirst();
//
//    }
//}
