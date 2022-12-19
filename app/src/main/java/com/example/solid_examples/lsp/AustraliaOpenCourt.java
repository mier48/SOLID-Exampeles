package com.example.solid_examples.lsp;

import android.util.Log;

public class AustraliaOpenCourt extends Court implements HardCourt {

    @Override
    public void cleanHardCourt() {
        Log.e("TAG", "clean hard court in Australia Open");
    }
}
