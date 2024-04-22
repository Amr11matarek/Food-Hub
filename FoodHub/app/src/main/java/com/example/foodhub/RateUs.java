package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateUs extends AppCompatActivity {

    Button BackToHome , Submit;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_us);

        Intent Back = new Intent(this , Home_Screen.class);
        Intent End = new Intent(this , EndOfApp.class);

        BackToHome = findViewById(R.id.BackToHomeBtn);
        Submit = findViewById(R.id.submitBtn);
        ratingBar = findViewById(R.id.ratingbar);

        BackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Back);
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext() , r+" Star" , Toast.LENGTH_SHORT).show();
                startActivity(End);
            }
        });

    }
}