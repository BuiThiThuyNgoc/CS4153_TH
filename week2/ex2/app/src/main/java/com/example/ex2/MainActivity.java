package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.LinearLayout;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButtonRed, radioButtonGreen, radioButtonGray, radioButtonBlue;
    private LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonRed = findViewById(R.id.btnRed);
        radioButtonGreen = findViewById(R.id.btnGreen);
        radioButtonGray = findViewById(R.id.btnGray);
        radioButtonBlue = findViewById(R.id.btnBlue);
        linearLayout = findViewById(R.id.linearLayout);

        radioButtonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.RED);
            }
        });
        radioButtonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.GREEN);
            }
        });
        radioButtonGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.GRAY);
            }
        });
        radioButtonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.BLUE);
            }
        });
    }


}