package com.example.foodhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Home_Screen2 extends AppCompatActivity {

    Button dec , inc , addToCart;
    TextView inc_dec , price;
    int x;
    float t , p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen2);

        Intent confirm = new Intent(this , Confirm.class);

        dec = findViewById(R.id.decButton);
        inc = findViewById(R.id.incButton);
        inc_dec = findViewById(R.id.inc_dec);
        price = findViewById(R.id.Home_Screen2_Price);
        addToCart = findViewById(R.id.addtocart);

        x = Integer.parseInt(inc_dec.getText().toString());
        p = Float.parseFloat(price.getText().toString());

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x+1;
                t =p*x;
                if (x<0)
                    x=0;

                inc_dec.setText(Integer.toString(x));
                t = p*x;
                price.setText(t+"$");
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=x-1;
                t =p*x;
                if (x<0)
                    x=0;
                inc_dec.setText(Integer.toString(x));
                t = p*x;
                price.setText(t+"$");
            }
        });


        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(Home_Screen2.this,"Order is Done", Toast.LENGTH_SHORT).show();
                    startActivity(confirm);

                }


        });






        //Recycler intent
        String name = getIntent().getStringExtra("NAME");
        String price = getIntent().getStringExtra("PRICE");
        String desc = getIntent().getStringExtra("DESC");
        int image = getIntent().getIntExtra("IMAGE" , 0);

        TextView home2_name = findViewById(R.id.Home_Screen2_Name);
        TextView home2_price = findViewById(R.id.Home_Screen2_Price);
        TextView home2_desc = findViewById(R.id.Home_Screen2_Desc);
        ImageView home2_image =findViewById(R.id.Home_Screen2_Image);

        home2_name.setText(name);
        home2_price.setText(price);
        home2_desc.setText(desc);
        home2_image.setImageResource(image);
    }
}
