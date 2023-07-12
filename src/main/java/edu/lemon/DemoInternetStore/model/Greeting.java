package edu.lemon.DemoInternetStore.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Greeting {
    @NonNull private User user;
    @NonNull private String message;
}
