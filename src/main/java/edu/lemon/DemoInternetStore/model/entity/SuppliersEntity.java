package edu.lemon.DemoInternetStore.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "suppliers")
public class SuppliersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name")
    @NonNull private String name;

    @Column(name = "organisation_name")
    @NonNull private String organisationName;

    @Column(name = "email")
    @NonNull private String email;

    @Column(name = "password")
    @NonNull private String password;

    @Column(name = "phone")
    @NonNull private String phone;

    @OneToOne(fetch = FetchType.LAZY,
              cascade = CascadeType.ALL,
              orphanRemoval = true)
    @JoinColumn(name = "document_id",
                referencedColumnName = "id")
    @NonNull private DocumentsEntity document;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_suppliers",
            joinColumns = @JoinColumn(name = "supplier_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    @NonNull private Set<ProductsEntity> products;
}
