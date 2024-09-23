package com.firebase.notificationandroidstudio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btn1 = findViewById(R.id.secondActivityButton1);
        btn1.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity4.this, com.firebase.notificationandroidstudio.MainActivity1.class);
        });

        Button btn2 = findViewById(R.id.secondActivityButton2);
        btn2.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity4.this, com.firebase.notificationandroidstudio.MainActivity2.class);
            startActivity(intent2);
        });

        Button btn4 = findViewById(R.id.secondActivityButton4);
        btn4.setOnClickListener(view2 -> {
            Intent intent4 = new Intent(MainActivity4.this, MainActivity4.class);
            startActivity(intent4);
        });

        Button btn6 = findViewById(R.id.secondActivityButton6);
        btn6.setOnClickListener(view4 -> {
            Intent intent6 = new Intent(MainActivity4.this, MainActivity6.class);
            startActivity(intent6);
        });
    }
}