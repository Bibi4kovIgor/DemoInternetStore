package edu.lemon.DemoInternetStore.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {
    @NonNull private String name;
    @NonNull private String pass;
}
