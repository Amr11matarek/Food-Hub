package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    Button FacebookBtn, GoogleBtn , Sing_upBtn;
    TextView SingInTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Intent ONB1 = new Intent(this, Onboadring1.class);
        Intent ONB1_fg = new Intent(this, Onboadring1_FG.class);
        Intent LoginS = new Intent(this, Login.class);

        FacebookBtn = findViewById(R.id.FacebookBtn);
        GoogleBtn = findViewById(R.id.GoogleBtn);
        SingInTxt = findViewById(R.id.SinginTexT);
        Sing_upBtn = findViewById(R.id.SingBtn);


        FacebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Welcome.this,"Successfully Logged in", Toast.LENGTH_SHORT).show();
                startActivity(ONB1_fg);
            }
        });

        GoogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Welcome.this,"Successfully Logged in", Toast.LENGTH_SHORT).show();
                startActivity(ONB1_fg);
            }
        });
        SingInTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(LoginS);
            }
        });
        Sing_upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ONB1);
            }
        });
    }
}