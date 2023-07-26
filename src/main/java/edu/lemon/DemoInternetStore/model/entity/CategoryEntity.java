package edu.lemon.DemoInternetStore.model.entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
@Entity
public class CategoryEntity {
    @NonNull UUID id;
    @NonNull String name;
    @NonNull String description;
}
