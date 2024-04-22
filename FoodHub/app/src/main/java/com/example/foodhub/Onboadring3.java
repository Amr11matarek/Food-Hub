package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboadring3 extends AppCompatActivity {

    Button ONB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboadring3);

        Intent ONB3intent = new Intent(this, Signup.class);

        ONB3=findViewById(R.id.BtnONB3);

        ONB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB3intent);
            }
        });
    }
}