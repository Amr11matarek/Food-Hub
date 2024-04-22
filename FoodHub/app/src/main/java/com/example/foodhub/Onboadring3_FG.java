package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboadring3_FG extends AppCompatActivity {

    Button ONB3_fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboadring3_fg);

        Intent ONB3_fgintent = new Intent(this, Home_Screen.class);

        ONB3_fg=findViewById(R.id.BtnONB3_FG);

        ONB3_fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB3_fgintent);
            }
        });
    }
}