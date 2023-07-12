package edu.lemon.DemoInternetStore.repositories;

import edu.lemon.DemoInternetStore.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static edu.lemon.DemoInternetStore.data.Data.USERS;

public class UsersRepository {
    private final List<User> users;

    private UsersRepository(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers(){
        return Collections.unmodifiableList(users);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public static UsersRepository getInstance() {
        return SingletonUsers.INSTANCE;
    }

    private static final class SingletonUsers {
        private static final List<User> users = new ArrayList<>(USERS);
        private static final UsersRepository INSTANCE = new UsersRepository(users);
    }
}
