package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Onboadring2 extends AppCompatActivity {

    Button ONB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboadring2);

        Intent ONB2intent = new Intent(this, Onboadring3.class);

        ONB2=findViewById(R.id.BtnONB2);

        ONB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB2intent);
            }
        });

    }
}