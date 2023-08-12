package edu.lemon.DemoInternetStore.model.repositories;

import edu.lemon.DemoInternetStore.model.dto.ProductsDto;
import edu.lemon.DemoInternetStore.model.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductsReadRepository extends JpaRepository<ProductsEntity, UUID> {

    List<ProductsDto> findByNameContaining(String name);

    // TODO: Test query -> remove
    List<ProductsEntity> findAll();

}
