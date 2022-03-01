package com.example.kotlin.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.kotlin.R;

public class JavaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main2);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_a, new FragmentReceiver())
                .add(R.id.container_b, new FragmentB())
                .commit();

    }
}