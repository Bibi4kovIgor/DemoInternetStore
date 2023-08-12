package edu.lemon.DemoInternetStore.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "baskets")
public class BasketsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Id
    private UUID customer_id;

    @Id
    private UUID product_id;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "create_date")
    private Instant createDate;



}
