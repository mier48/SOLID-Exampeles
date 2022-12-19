package com.example.solid_examples.lsp;

import android.util.Log;

public class WimbledonCourt extends Court implements GrassCourt {

    @Override
    public void cutGrass() {
        Log.e("TAG", "Cut grass in Wimbledon");
    }
}
