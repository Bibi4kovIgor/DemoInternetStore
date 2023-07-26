package edu.lemon.DemoInternetStore.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
public class CategoryDto {
    @NonNull UUID id;
    @NonNull String name;
    @NonNull String description;
}
