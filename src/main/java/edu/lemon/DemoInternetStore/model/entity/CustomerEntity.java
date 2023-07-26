package edu.lemon.DemoInternetStore.model.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name")
    @NonNull private String firstName;

    @Column(name = "last_name")
    @NonNull private String lastName;

    @Column(name = "phone")
    @NonNull private String phone;

    @Column(name = "login")
    @NonNull private String login;

    @Column(name = "email")
    @NonNull private String email;

    @Column(name = "pass")
    @NonNull private String pass;

    @Column(name = "tax_id")
    @NonNull private String taxId;

    @Column(name = "passport")
    private String passport;

    @Column(name = "age")
    private int age;

}
