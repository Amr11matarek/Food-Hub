package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConfirmMap extends AppCompatActivity {

    Button confirm_map_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        Intent rate_us = new Intent(this , RateUs.class);
        confirm_map_button = findViewById(R.id.confirm_map_button);

        confirm_map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConfirmMap.this,"Order Arrived", Toast.LENGTH_SHORT).show();
                startActivity(rate_us);

            }
        });

    }
}