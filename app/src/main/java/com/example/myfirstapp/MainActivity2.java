package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView= findViewById(R.id.textView3);
        Intent intent =getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView.setText("your name is " + name);
    }
}