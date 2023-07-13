package edu.lemon.DemoInternetStore.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
public class CategoryEntity {
    @NonNull UUID id;
    @NonNull String name;
    @NonNull String description;
}
