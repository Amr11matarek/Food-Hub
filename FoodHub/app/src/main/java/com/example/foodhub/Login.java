package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    EditText E_mail;
    EditText Passowrd;
    Button Logn_In , FaceBookL , GoogleL;
    public DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Intent HomeS = new Intent(this, Home_Screen.class);

        E_mail = findViewById(R.id.LoginEmail);
        Passowrd = findViewById(R.id.LoginPassword);
        Logn_In = findViewById(R.id.LOGNINBTN);
        FaceBookL = findViewById(R.id.LoginFacebookBtn2);
        GoogleL = findViewById(R.id.LoginGoogleBtn2);

        dbHandler = new DBHandler(Login.this);

        Logn_In.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = E_mail.getText().toString();
                String password = Passowrd.getText().toString();

                if (password.isEmpty() && email.isEmpty()) {
                    Toast.makeText(Login.this, "Please enter all data", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Boolean checkpassword = dbHandler.checkemailpassoword(email,password);
                    if (checkpassword == true){
                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(HomeS);
                    }
                    else {
                        Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        FaceBookL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Successfully Logged in", Toast.LENGTH_SHORT).show();
                startActivity(HomeS);
            }
        });

        GoogleL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Successfully Logged in", Toast.LENGTH_SHORT).show();
                startActivity(HomeS);
            }
        });

    }
}