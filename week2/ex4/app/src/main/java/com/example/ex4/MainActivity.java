package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2,editText3;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGet = new Intent(getApplicationContext(), ViewContactActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name1", editText1.getText().toString());
                bundle.putString("email1", editText2.getText().toString());
                bundle.putString("project1", editText3.getText().toString());
                iGet.putExtras(bundle);

                startActivity(iGet);
            }
        });
    }
}