package com.example.solid_examples.dip;

public class UserFactory {

    public static UserRepository create() {
        return new LocalUserRepository();
    }
}
