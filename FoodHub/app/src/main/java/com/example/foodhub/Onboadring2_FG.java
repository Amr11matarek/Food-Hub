package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboadring2_FG extends AppCompatActivity {

    Button ONB2_fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboadring2_fg);

        Intent ONB2_fgintent = new Intent(this, Onboadring3_FG.class);

        ONB2_fg=findViewById(R.id.BtnONB2_FG);

        ONB2_fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB2_fgintent);
            }
        });
    }
}