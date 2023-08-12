package edu.lemon.DemoInternetStore.model.repositories;

import edu.lemon.DemoInternetStore.model.entity.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomersModifyRepository extends JpaRepository<CustomersEntity, UUID> {
}
