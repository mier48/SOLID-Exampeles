package com.example.solid_examples.lsp;

import android.util.Log;

public class RolandGarrosCourt extends Court implements ClayCourt {

    @Override
    public void changeClay() {
        Log.e("TAG", "Change clay in Roland Garros");
    }
}
