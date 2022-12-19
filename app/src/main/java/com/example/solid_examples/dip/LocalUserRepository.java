package com.example.solid_examples.dip;

public class LocalUserRepository implements UserRepository {

    public User getUser(int id) {
        return new User(1, "Test", "info@info.com");
    }
}
