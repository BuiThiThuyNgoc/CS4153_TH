package com.example.ex4;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class ViewContactActivity extends AppCompatActivity {
    TextView txt_name, txt_email, txt_project;
    Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);

        txt_name = findViewById(R.id.txt_name);
        txt_email = findViewById(R.id.txt_email);
        txt_project = findViewById(R.id.txt_project);
        finishBtn = findViewById(R.id.finishBtn);

        finishBtn.setOnClickListener(mClickFinish);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name1");
        String email = bundle.getString("email1");
        String project = bundle.getString("project1");

        txt_name.setText(name);
        txt_email.setText(email);
        txt_project.setText(project);
    }
    private View.OnClickListener mClickFinish = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}