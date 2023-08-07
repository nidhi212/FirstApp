package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME ="com.example.myfirstapp.extra.NAME";
    private Button button;
    private TextView text, textie, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button3);
        text = findViewById(R.id.editText);

        textie= findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hi clickListener Worked", Toast.LENGTH_SHORT).show();
                String s= text.getText().toString();
                int kg = Integer.parseInt(s);
                double pound= 2.205 * kg;
                textie.setText("the Corresponding value in pound is" + pound);
            }
        });

    }
    public void onClick(View V){
        Toast.makeText(MainActivity.this,"MultiScreen", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this, MainActivity2.class);
        text2 = findViewById(R.id.editText2);
        String nametext = text2.getText().toString();
        intent.putExtra(EXTRA_NAME,nametext);
        startActivity(intent);

    }
}