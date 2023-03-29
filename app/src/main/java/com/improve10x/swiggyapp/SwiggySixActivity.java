package com.improve10x.swiggyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggySixActivity extends AppCompatActivity {
    RecyclerView biriyaniRv;
    public SwiggyItem6[] swiggyItem6s;
    public SwiggySixRvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_six);
        initView();
        createSwiggy6Data();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
    biriyaniRv.setLayoutManager(new GridLayoutManager(this,3) );
    biriyaniRv.setAdapter(adapter);
    }

    private void setupAdapter() {
    adapter = new SwiggySixRvAdapter(swiggyItem6s);
    }

    private void createSwiggy6Data() {
        swiggyItem6s = new SwiggyItem6[7];
        SwiggyItem6 item1 = new SwiggyItem6();
        item1.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item1.dicount = "-40%";
        item1.dish = "Aasife Biriyani";
        item1.biriyaniDish = "Biriyani,Tandoori & chines";
        item1.rating1 = "4.5";
        item1.time1= "30Min";
        swiggyItem6s[0] = item1;

        SwiggyItem6 item2 = new SwiggyItem6();
        item2.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item2.dicount = "veg";
        item2.dish = "Akshaya Pure";
        item2.biriyaniDish = "South indian & chinese";
        item2.rating1 = "4.0";
        item2.time1= "30 Min";
        swiggyItem6s[1] = item2;

        SwiggyItem6 item3 = new SwiggyItem6();
        item3.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item3.dicount = "sam";
        item3.dish = "Al Ajwain";
        item3.biriyaniDish = "Chinese, Tandoori & Indian";
        item3.rating1 = "4.7";
        item3.time1= "30 Min";
        swiggyItem6s[2] = item3;

        SwiggyItem6 item4 = new SwiggyItem6();
        item4.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item4.dicount = "sam";
        item4.dish = "Anjappar";
        item4.biriyaniDish = "Chinese , Tandoori & indian";
        item4.rating1 = "3.2";
        item4.time1= "45 Mit";
        swiggyItem6s[3] = item4;

        SwiggyItem6 item5 = new SwiggyItem6();
        item5.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item5.dicount = "-25%";
        item5.dish = "Cake & berrys";
        item5.biriyaniDish = "Cakes , Sweets & Snacks";
        item5.rating1 = "4.5";
        item5.time1= "45 Min";
        swiggyItem6s[4] = item5;

        SwiggyItem6 item6 = new SwiggyItem6();
        item6.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item6.dicount = "-10%";
        item6.dish = "Copper Kitchen";
        item6.biriyaniDish = "Chettinadu , tandoori";
        item6.rating1 = "3.3";
        item6.time1= "45 Min";
        swiggyItem6s[5] = item6;

        SwiggyItem6 item7 = new SwiggyItem6();
        item7.food = "https://s3-media4.fl.yelpcdn.com/bphoto/GGNZH1ZeKNG3UbovyK3tiw/ls.jpg";
        item7.dicount = "-25%";
        item7.dish = "SS Pannire chiken";
        item7.biriyaniDish = "chiken";
        item7.rating1 = "4.1";
        item7.time1= "23 Min";
        swiggyItem6s[6] = item7;
    }

    private void initView() {
    biriyaniRv = findViewById(R.id.biriyani_rv);
    }
}