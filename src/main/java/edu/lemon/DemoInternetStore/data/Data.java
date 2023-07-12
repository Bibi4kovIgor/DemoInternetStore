package edu.lemon.DemoInternetStore.data;

import edu.lemon.DemoInternetStore.model.Greeting;
import edu.lemon.DemoInternetStore.model.User;

import java.util.Base64;
import java.util.List;

public interface Data {

    List<User> USERS = List.of(
            new User("Ihor", Base64.getEncoder().encodeToString("password".getBytes())),
            new User("Sam", Base64.getEncoder().encodeToString("password123".getBytes())),
            new User("Yens", Base64.getEncoder().encodeToString("password321".getBytes())),
            new User("Tim", Base64.getEncoder().encodeToString("password445".getBytes())));

    List<Greeting> GREETINGS = List.of(
            new Greeting(USERS.get(0), "Hello!"),
            new Greeting(USERS.get(1), "Greet!"),
            new Greeting(USERS.get(2), "Good afternoon!"));

}
