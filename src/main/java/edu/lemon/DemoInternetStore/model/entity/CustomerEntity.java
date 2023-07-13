package edu.lemon.DemoInternetStore.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
public class CustomerEntity {
    @NonNull private UUID id;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private String phone;
    @NonNull private String login;
    @NonNull private String email;
    @NonNull private String pass;
    @NonNull private String taxId;
    private String passport;
    private int age;

}
