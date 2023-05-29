package com.example.ex4;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class MainActivity extends AppCompatActivity {

    private EditText editTextData;
    Button btnRead, btnWrite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRead = findViewById(R.id.btnRead);
        btnWrite = findViewById(R.id.btnWrite);
        editTextData = findViewById(R.id.editTextData);

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readDataFromResource();
            }
        });

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeDataToResource();
            }
        });

    }

    private void readDataFromResource() {
        Resources res = getResources();
        InputStream inputStream = res.openRawResource(R.raw.myfile);

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        editTextData.setText(stringBuilder.toString());
    }

    private void writeDataToResource() {
        String data = editTextData.getText().toString();
        String raw = Environment.getExternalStorageDirectory().getAbsolutePath() + "/myfile.txt";

        try {
            FileOutputStream fos = new FileOutputStream(raw);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            writer.write(data);
            writer.close();

            editTextData.setText("Write successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
