package edu.lemon.DemoInternetStore.model.dto;

import lombok.Builder;


@Builder
public record CategoriesDto(String id, String name, String description){}
