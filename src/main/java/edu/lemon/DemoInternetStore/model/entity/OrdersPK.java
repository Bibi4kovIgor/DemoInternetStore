package edu.lemon.DemoInternetStore.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
public class OrdersPK implements Serializable {
    @NonNull private final UUID customerId;
    @NonNull private final UUID productId;
}
