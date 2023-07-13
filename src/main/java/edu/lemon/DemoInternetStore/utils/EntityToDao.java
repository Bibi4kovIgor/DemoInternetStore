package edu.lemon.DemoInternetStore.utils;

import edu.lemon.DemoInternetStore.model.dao.CustomerDao;
import edu.lemon.DemoInternetStore.model.entity.CustomerEntity;

public class EntityToDao {
    public static CustomerDao customerEntityToCustomerDao(CustomerEntity customerEntity) {
        return CustomerDao.builder()
                .age(customerEntity.getAge())
                .email(customerEntity.getEmail())
                .phone(customerEntity.getPhone())
                .taxId(customerEntity.getTaxId())
                .pass(customerEntity.getPass())
                .id(customerEntity.getId())
                .login(customerEntity.getLogin())
                .firstName(customerEntity.getFirstName())
                .lastName(customerEntity.getLastName())
                .passport(customerEntity.getPassport())
                .build();
    }
}
