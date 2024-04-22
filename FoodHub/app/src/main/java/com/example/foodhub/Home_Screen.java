package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import Adabters.CatagoryAdabter;
import Adabters.FeatureAdabter;
import Adabters.PopularitemsAdabter;
import Models.Catagory;
import Models.Features;
import Models.Popularitems;

public class Home_Screen extends AppCompatActivity implements FeatureRecyclerOnclick, PopulareitemsRecyclerOnclick {

    //NavigationBar
//    BottomNavigationView bottomNavigationView;

    RecyclerView CatagoryRec , FeatureRec , PopularitemsRec;
    ArrayList<Catagory> catagoryproducts = new ArrayList<>();
    ArrayList<Features> featuresproducts = new ArrayList<>();
    ArrayList<Popularitems> popularitemsproducts = new ArrayList<>();

    //catagory..
    String[] catagoryName = {"Burger","Donat","Pizza","Mexican","Asian"};
    int [] catagoryImage = {R.drawable.catagory1,R.drawable.catagory2,R.drawable.catagory3,
            R.drawable.catagory4, R.drawable.catagory5};

    //features
    String [] featureName = {"McDonald’s","Starbuck","McDonald’s","Starbuck"};
    String [] featureDelivary = {" free delivery"," $2 delivery"," free delivery"," $2 delivery"};
    String [] featurePrice = {" $9.50"," $9.50"," $9.50"," $9.50"};
    String [] featureTime = {" 10-15 mins"," 10-15 mins"," 10-15 mins"," 10-15 mins"};
    String [] featureDesc = {" Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."," Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."," Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."," Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."};

    int [] featureImage = {R.drawable.features,R.drawable.features2,R.drawable.features,R.drawable.features2};

    //popularitem
    String [] popularitemName = {"Red n hot pizza","Meat pasta","Bruschetta","Greek salad "};
    String [] popularitemsDesc = {"Spicy chicken, beef","meat and basil","toppings of tomato","with baked salmon"};
    String [] popularitemprice = {" $9.50"," $9.50"," $9.50"," $9.50"};
    String [] popularitemDesc2 = {" Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."," Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."," Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."," Brown the beef better.\n" +
            " Lean ground beef – I like to use \n85% lean angus.\n" +
            " Garlic – use fresh chopped.Spices – \nchili powder,\n" +
            " cumin, onion powder."};
    int [] popularitemimage = {R.drawable.popularitem1,R.drawable.popularitem2,R.drawable.popularitem3,R.drawable.popularitem4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //NavigationBar
//        bottomNavigationView = findViewById(R.id.Navigation_Bar);


        setContentView(R.layout.home_screen);

        CatagoryRec = findViewById(R.id.catagory);
        FeatureRec = findViewById(R.id.featured);
        PopularitemsRec = findViewById(R.id.Popularitems);

        //Layout Manger
        CatagoryRec.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL ,false));
        FeatureRec.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL ,false));
        PopularitemsRec.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL ,false));
        PopularitemsRec.setLayoutManager(new GridLayoutManager(this, 2));

        CatagoryAdabter catagoryAdabter = new CatagoryAdabter(this , catagoryproducts);
        FeatureAdabter featureAdabter = new FeatureAdabter(this , featuresproducts , this);
        PopularitemsAdabter popularitemsAdabter = new PopularitemsAdabter(this , popularitemsproducts , this);

        CatagoryRec.setAdapter(catagoryAdabter);
        FeatureRec.setAdapter(featureAdabter);
        PopularitemsRec.setAdapter(popularitemsAdabter);

        setupcatagoryproducts();
        setupfeaturesproducts();
        setuppopularitemsproducts();




//        //NavigationBar
//        bottomNavigationView.setSelectedItemId(R.id.item1);
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
//                        return true;
//
//                    case R.id.cart:
//                        startActivity(new Intent(getApplicationContext(), AddToCart_Fragment.class));
//                        overridePendingTransition(0 , 0);
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



    private void setuppopularitemsproducts() {

        for (int i =0 ; i < popularitemName.length ; i++){
            popularitemsproducts.add(new Popularitems(popularitemName[i],popularitemsDesc[i],popularitemimage[i] , popularitemprice[i] , popularitemDesc2[i]));
        }

    }

    private void setupfeaturesproducts() {

        for (int i =0 ; i < featureName.length ; i++){
            featuresproducts.add(new Features(featureName[i],featureTime[i],
                    featureDelivary[i],featureImage[i],featurePrice[i],featureDesc[i]));
        }
    }

    private void setupcatagoryproducts() {

        for (int i =0 ; i < catagoryName.length ; i++){
            catagoryproducts.add(new Catagory(catagoryName[i],catagoryImage[i]));
        }

    }


    //onClick Recyclerview Items
    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(Home_Screen.this , Home_Screen2.class);
        intent.putExtra("NAME" , featuresproducts.get(position).getFeaturesName());
        intent.putExtra("PRICE" , featuresproducts.get(position).getFeaturesPrice());
        intent.putExtra("DESC" , featuresproducts.get(position).getFeaturesDesc());
        intent.putExtra("IMAGE",featuresproducts.get(position).getFeaturesImage());

        startActivity(intent);

    }

    //onClick Recyclerview Items
    @Override
    public void PopularitemonItemClick (int position) {
        Intent intent = new Intent(Home_Screen.this , Home_screen3.class);
        intent.putExtra("NAME" , popularitemsproducts.get(position).getPopularitemesName());
        intent.putExtra("PRICE" , popularitemsproducts.get(position).getPopularitemPrice());
        intent.putExtra("DESC" , popularitemsproducts.get(position).getPopularitemDesc2());
        intent.putExtra("IMAGE",popularitemsproducts.get(position).getPopularitemsImage());

        startActivity(intent);

    }

}