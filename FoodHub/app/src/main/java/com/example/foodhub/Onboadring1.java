package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboadring1 extends AppCompatActivity {

    Button ONB1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboadring1);

        Intent ONB1intent = new Intent(this, Onboadring2.class);

        ONB1=findViewById(R.id.BtnONB1);

        ONB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB1intent);
            }
        });

    }
}