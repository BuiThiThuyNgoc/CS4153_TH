package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class historyActivity extends AppCompatActivity {
    private Button btnKeyboard, btnClearHistory;
    private ListView listView;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btnKeyboard = this.findViewById(R.id.btnKeyboard);
        btnClearHistory = this.findViewById(R.id.btnClearHistory);

        listView = this.findViewById(R.id.listView);


        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        Set<String> historySet = sharedPreferences.getStringSet("history", new HashSet<String>());
        List<String> historyList = new ArrayList<>(historySet);
        Collections.reverse(historyList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, historyList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        btnKeyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(historyActivity.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(historyActivity.this, "Go to the keyboard page", Toast.LENGTH_SHORT).show();


            }
        });

        btnClearHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<String> adapter = (ArrayAdapter<String>)listView.getAdapter();
                if (adapter != null) {
                    adapter.clear();
                    adapter.notifyDataSetChanged();
                }
                Toast.makeText(historyActivity.this, "Successfully delete history", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
