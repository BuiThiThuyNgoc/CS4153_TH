package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.provider.ContactsContract;
import android.provider.Settings;

public class MainActivity extends AppCompatActivity {
    private Button btn_google, btn_phone, btn_mess, btn_contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_phone = findViewById(R.id.btn_phone);
        btn_google = findViewById(R.id.btn_google);
        btn_mess =  findViewById(R.id.btn_mess);
        btn_contact = findViewById(R.id.btn_contact);

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });
        btn_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel: 8412345789"));
                startActivity(intent);
            }
        });
        btn_mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms: 8412345789"));
                intent.putExtra("sms_body", "Bui Thi Thuy Ngoc ");
                startActivity(intent);
            }
        });

        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DEFAULT, ContactsContract.Contacts.CONTENT_URI);

                startActivity(intent);
            }
        });
    }
}