package com.example.tokodvd.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.tokodvd.R;
import com.ornach.nobobutton.NoboButton;

public class Login extends AppCompatActivity {

    Button btnregis;
    NoboButton btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnregis = (Button) findViewById(R.id.btnregis);
        btnlogin = (NoboButton) findViewById(R.id.loginbtn);
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(Login.this, Registrasi.class);
                startActivity(i);
                finish();
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,Registrasi.class);
                startActivity(i);
                finish();

            }
        });

    }
}
