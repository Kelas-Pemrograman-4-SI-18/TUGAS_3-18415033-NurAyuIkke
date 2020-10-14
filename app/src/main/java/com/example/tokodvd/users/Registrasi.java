package com.example.tokodvd.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.tokodvd.R;
import com.ornach.nobobutton.NoboButton;

public class Registrasi extends AppCompatActivity {
    Button btnBack;
    NoboButton btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        btnRegistrasi = (NoboButton) findViewById(R.id.regisbtn);
        btnBack = (Button) findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, Login.class);
                startActivity(i);
                finish();
            }
        });

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}
