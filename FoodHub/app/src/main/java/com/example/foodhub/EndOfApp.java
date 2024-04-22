package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndOfApp extends AppCompatActivity {

    Button BackToHome2 , Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);

        Intent Back = new Intent(this , Home_Screen.class);

        BackToHome2 = findViewById(R.id.BackToHomeBtn2);
        Exit = findViewById(R.id.ExitBtn);

        BackToHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Back);
            }
        });

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });
    }
}