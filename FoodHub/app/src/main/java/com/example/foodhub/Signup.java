package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    EditText Fullname;
    EditText E_mail;
    EditText Passowrd;
    TextView LoginTxt;
    Button Sign_Up , FaceBookBtn2 , GoogleBtn2;
    public DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        int x=1;

        Intent LoginS = new Intent(this,Login.class);
        Intent HomeS = new Intent(this,Home_Screen.class);

        LoginTxt = findViewById(R.id.LTXT);

        Fullname = findViewById(R.id.Fullname);
        E_mail = findViewById(R.id.Email);
        Passowrd = findViewById(R.id.Password);
        Sign_Up = findViewById(R.id.SINGUPBTN);
        FaceBookBtn2 = findViewById(R.id.FacebookBtn2);
        GoogleBtn2 = findViewById(R.id.GoogleBtn2);

        dbHandler = new DBHandler(Signup.this);

        Sign_Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fullname = Fullname.getText().toString();
                String password = Passowrd.getText().toString();
                String email = E_mail.getText().toString();

                if(fullname.isEmpty()||password.isEmpty()||email.isEmpty()){
                    Toast.makeText(Signup.this, "Please enter all data", Toast.LENGTH_SHORT).show();
                    return;
                }

                else {

                    if (x==1){
                        Boolean checkemail = dbHandler.checkemail(email);
                        if (checkemail == false){
                            Boolean insert = dbHandler.addContact(fullname,password,email);
                            if (insert == true){

                                startActivity(LoginS);

                                Toast.makeText(Signup.this,"Your Data is Saved", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Toast.makeText(Signup.this,"Sign up is Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(Signup.this,"User Already Exists ", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {

                        Toast.makeText(Signup.this,"User Already Exists ", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });

        LoginTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(LoginS);
            }
        });

        FaceBookBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this,"Successfully Logged in", Toast.LENGTH_SHORT).show();
                startActivity(HomeS);
            }
        });

        GoogleBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this,"Successfully Logged in", Toast.LENGTH_SHORT).show();
                startActivity(HomeS);
            }
        });

    }
}