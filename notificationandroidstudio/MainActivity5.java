package com.firebase.notificationandroidstudio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button btn = findViewById(R.id.secondActivityButton2);
        btn.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity5.this, com.firebase.notificationandroidstudio.MainActivity2.class);
            startActivity(intent2);
        });
        Button btn3 = findViewById(R.id.secondActivityButton3);
        btn3.setOnClickListener(view -> {
            Intent intent3 = new Intent(MainActivity5.this, com.firebase.notificationandroidstudio.MainActivity3.class);
            startActivity(intent3);
        });

        Button btn4 = findViewById(R.id.secondActivityButton4);
        btn4.setOnClickListener(view2 -> {
            Intent intent4 = new Intent(MainActivity5.this, MainActivity4.class);
            startActivity(intent4);
        });

        Button btn5 = findViewById(R.id.secondActivityButton5);
        btn5.setOnClickListener(view3 -> {
            Intent intent5 = new Intent(MainActivity5.this, MainActivity5.class);
            startActivity(intent5);
        });

        Button btn6 = findViewById(R.id.secondActivityButton6);
        btn6.setOnClickListener(view4 -> {
            Intent intent6 = new Intent(MainActivity5.this, MainActivity6.class);
            startActivity(intent6);
        });
    }
}