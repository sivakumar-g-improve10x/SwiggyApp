package com.improve10x.swiggyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyTwoActivity extends AppCompatActivity {
RecyclerView swiggy2Rv;
public Fooditem2[] fooditem2;
public SwiggyTwoRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_two);
        initViews();
        createSwiggyTwoData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
    swiggy2Rv.setLayoutManager(new LinearLayoutManager(this));
    swiggy2Rv.setAdapter(adapter);
    }

    private void setupAdapter() {
    adapter = new SwiggyTwoRvAdapter(fooditem2);
    }

    private void createSwiggyTwoData() {
    fooditem2 = new Fooditem2[5];
    Fooditem2 item1 = new Fooditem2();
    item1.dish1 = "Shawarma Roll";
    item1.dishName1 = "Meat  cut into thin slices and stuffed in Kuboos";
    item1.amount1 = "$80";
    fooditem2[0] = item1;

        Fooditem2 item2 = new Fooditem2();
        item2.dish1 = "Shawarma Plate";
        item2.dishName1 = "Meat  cut into thin slices and served with Kuboos";
        item2.amount1 = "$130";
        fooditem2[1] = item2;

        Fooditem2 item3 = new Fooditem2();
        item3.dish1 = "Special Shawarma Roll";
        item3.dishName1 = "Meat  cut into thin slices and styffed with special sauce";
        item3.amount1 = "$100";
        fooditem2[2] = item3;

        Fooditem2 item4 = new Fooditem2();
        item4.dish1 = "Special Shawarma Plate";
        item4.dishName1 = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        item4.amount1 = "$140";
        fooditem2[3] = item4;

        Fooditem2 item5 = new Fooditem2();
        item5.dish1 = "Shawarma Roll";
        item5.dishName1 = "Meat  cut into thin slices and stuffed in Kuboos";
        item5.amount1 = "$120";
        fooditem2[4] = item5;


    }

    private void initViews() {
        swiggy2Rv = findViewById(R.id.swiggy2_rv);
    }
}