package edu.lemon.DemoInternetStore.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    @NotNull private String name;

    @Column(name = "vendor_code")
    private String vendorCode;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;

//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products", cascade = CascadeType.ALL)
//    private Set<CategoriesEntity> categories;
//
//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products", cascade = CascadeType.ALL)
//    @NotNull Set<SuppliersEntity> suppliers;



}
