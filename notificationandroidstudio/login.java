package com.firebase.notificationandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(view4 -> {
            Intent intent = new Intent(login.this, MainActivity1.class);
            startActivity(intent);
        });


    }
}