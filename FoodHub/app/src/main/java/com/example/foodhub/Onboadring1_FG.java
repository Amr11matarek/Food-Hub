package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboadring1_FG extends AppCompatActivity {

    Button ONB1_fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboadring1_fg);

        Intent ONB1_fgintent = new Intent(this, Onboadring2_FG.class);

        ONB1_fg=findViewById(R.id.BtnONB1_FG);

        ONB1_fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB1_fgintent);
            }
        });
    }
}