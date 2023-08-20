package edu.lemon.DemoInternetStore.model.repositories;

import edu.lemon.DemoInternetStore.model.dto.CustomersDto;
import edu.lemon.DemoInternetStore.model.entity.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity, UUID> {
    Optional<CustomersDto> findByFirstName(String firstName);

}
