package com.example.solid_examples.dip;

import android.util.Log;

public class UserManager {

    public void showUser() {
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUser(1);

        Log.e("TAG", user.toString());
    }
}
