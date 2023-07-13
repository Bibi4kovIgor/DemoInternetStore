package edu.lemon.DemoInternetStore.utils;

import edu.lemon.DemoInternetStore.model.entity.CustomerEntity;

import java.util.Base64;
import java.util.Set;
import java.util.UUID;

public interface MockedData {
    Set<CustomerEntity> customers = Set.of(
            CustomerEntity.builder()
                    .age(31)
                    .email("some@email.com")
                    .phone("+3809655454512")
                    .taxId("45646489746dd")
                    .pass(Base64.getEncoder().encodeToString("password1".getBytes()))
                    .id(UUID.randomUUID())
                    .login("SomeLogin")
                    .firstName("Test")
                    .lastName("Test")
                    .passport("PassID")
                    .build(),
            CustomerEntity.builder()
                    .age(19)
                    .email("some3@email.com")
                    .phone("+3809651154512")
                    .taxId("45646339746dd")
                    .pass(Base64.getEncoder().encodeToString("password2".getBytes()))
                    .id(UUID.randomUUID())
                    .login("SomeLogin2")
                    .firstName("Test2")
                    .lastName("Test2")
                    .passport("PassID2")
                    .build(),

            CustomerEntity.builder()
                    .age(18)
                    .email("some@email2.com")
                    .phone("+380964454512")
                    .taxId("4564ddd746dd")
                    .pass(Base64.getEncoder().encodeToString("password3".getBytes()))
                    .id(UUID.randomUUID())
                    .login("SomeLogin1")
                    .firstName("Test1")
                    .lastName("Test1")
                    .passport("PassID1")
                    .build()
    );
}
