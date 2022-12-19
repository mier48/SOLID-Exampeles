package com.example.solid_examples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.solid_examples.lsp.GrassCourt;
import com.example.solid_examples.lsp.WimbledonCourt;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testGrassCourt();
    }

    public static void testGrassCourt() {
        List<GrassCourt> grassCourtList = new ArrayList<>();
        grassCourtList.add(new WimbledonCourt());

        for (GrassCourt court : grassCourtList) {
            court.cutGrass();
        }
    }
}