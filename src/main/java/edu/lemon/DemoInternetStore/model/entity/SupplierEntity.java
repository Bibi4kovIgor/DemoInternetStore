package edu.lemon.DemoInternetStore.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
public class SupplierEntity {
    @NonNull private UUID id;
    @NonNull private String organisationName;
    @NonNull private String name;
    @NonNull private Set<ProductEntity> productEntities;
    @NonNull private String taxId;
    @NonNull private String email;
    @NonNull private String phone;

}
