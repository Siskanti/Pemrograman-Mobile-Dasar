package com.example.pertemuan2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void Next(View view) {
        Intent next = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(next);
    }

    public void prev(View view) {
        Intent prev = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(prev);
    }
}