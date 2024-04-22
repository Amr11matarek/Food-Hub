package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Home_screen3 extends AppCompatActivity {

    Button dec2, inc2, addToCart2;
    TextView inc_dec2, price2;
    int x;
    float t , p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen3);

        Intent confirm = new Intent(this , Confirm.class);

        dec2 = findViewById(R.id.dec2Button);
        inc2 = findViewById(R.id.inc2Button);
        inc_dec2 = findViewById(R.id.inc_dec2);
        price2 = findViewById(R.id.Home_Screen3_Price);
        addToCart2 = findViewById(R.id.addtocart2);

        x = Integer.parseInt(inc_dec2.getText().toString());
        p = Float.parseFloat(price2.getText().toString());

        inc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+1;
                t =p*x;
                if (x<0)
                    x=0;

                inc_dec2.setText(Integer.toString(x));
                t = p*x;
                price2.setText(t+"$");
            }
        });

        dec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x-1;
                t =p*x;
                if (x<0)
                    x=0;
                inc_dec2.setText(Integer.toString(x));
                t = p*x;
                price2.setText(t+"$");
            }
        });


        addToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_screen3.this,"Order is Done", Toast.LENGTH_SHORT).show();
                startActivity(confirm);

            }


        });

        //Recycler intent
        String name = getIntent().getStringExtra("NAME");
        String price = getIntent().getStringExtra("PRICE");
        String desc = getIntent().getStringExtra("DESC");
        int image = getIntent().getIntExtra("IMAGE" , 0);

        TextView home3_name = findViewById(R.id.Home_Screen3_Name);
        TextView home3_price = findViewById(R.id.Home_Screen3_Price);
        TextView home3_desc = findViewById(R.id.Home_Screen3_Desc);
        ImageView home3_image =findViewById(R.id.Home_Screen3_Image);

        home3_name.setText(name);
        home3_price.setText(price);
        home3_desc.setText(desc);
        home3_image.setImageResource(image);
    }
}