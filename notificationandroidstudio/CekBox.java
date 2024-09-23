package com.firebase.notificationandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CekBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_box);

        ImageButton imageButton = findViewById(R.id.ceklis);
        imageButton.setOnClickListener(view -> {
            Intent int1 = new Intent(CekBox.this,MainActivity3.class);
            startActivity(int1);
        });

        ImageButton imageButton1 = findViewById(R.id.silang);
        imageButton.setOnClickListener(view -> {
            Intent int1 = new Intent(CekBox.this,MainActivity.class);
            startActivity(int1);
        });
    }
}