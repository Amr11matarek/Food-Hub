package fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodhub.Home_Screen;
import com.example.foodhub.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddToCart_Fragment extends AppCompatActivity {

    //NavigationBar
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtocart_fragment);

//        bottomNavigationView = findViewById(R.id.Navigation_Bar);

//        bottomNavigationView.setSelectedItemId(R.id.cart);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.location:
//                        startActivity(new Intent(getApplicationContext(), Location_Fragment.class));
//                        overridePendingTransition(0 , 0);
//                        return true;
//
//                    case R.id.item1:
//                        startActivity(new Intent(getApplicationContext(), Home_Screen.class));
//                        overridePendingTransition(0 , 0);
//                        return true;
//
//                    case R.id.cart:
//                        return true;
//
//                    case R.id.notifgations:
//                        startActivity(new Intent(getApplicationContext(), Notifgations_Fragment.class));
//                        overridePendingTransition(0 , 0);
//                        return true;
//                }
//                return false;
//            }
//        });
    }
}