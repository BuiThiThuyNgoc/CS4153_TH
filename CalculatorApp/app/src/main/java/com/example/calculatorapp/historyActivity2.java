package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class historyActivity2 extends AppCompatActivity {
    private Button btnKeyboard, btnClearHistory, btnAC, btnC;
    private TextView textviewHistory, textviewResult ;
    private String  number = null;
    double lastnumber = 0, firstnumber = 0;
    boolean operator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        btnKeyboard = this.findViewById(R.id.btnKeyboard);
        btnClearHistory = this.findViewById(R.id.btnClearHistory);

        textviewResult = this.findViewById(R.id.textviewResult);
        textviewHistory = this.findViewById(R.id.textviewHistory);

        btnKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(historyActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //btnAC.setOnClickListener(view -> {
            //number = null;
            //operator = false;
            //textviewHistory.setText(" ");
            //firstnumber = 0;
            //lastnumber = 0;
        //});

    }
}