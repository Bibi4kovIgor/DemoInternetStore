package edu.lemon.DemoInternetStore.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
public class CategoryDao {
    @NonNull UUID id;
    @NonNull String name;
    @NonNull String description;
}
