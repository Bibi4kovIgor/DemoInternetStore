package edu.lemon.DemoInternetStore.model.dao;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder
public class OrderDao {
    @NonNull private final CustomerDao customerDao;
    @NonNull private final ProductDao productDao;
    private int quantity;
    @NonNull private final Instant orderDate;
}
