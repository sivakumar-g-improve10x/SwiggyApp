package com.improve10x.swiggyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggytFourActivity extends AppCompatActivity {
RecyclerView swiggy4Rv;
public SwiggyItem4[] swiggyItem4;
public SwiggySixRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_four);
        initViews();
        createItemData();
        connectAdapter();
    }

    private void connectAdapter() {
        swiggy4Rv.setLayoutManager(new LinearLayoutManager(this));
        swiggy4Rv.setAdapter(adapter);
    }



    private void createItemData() {
        swiggyItem4 = new SwiggyItem4[7];
        SwiggyItem4 item1 = new SwiggyItem4();
        item1.dishName = "";
        item1.subDish = "";
        item1.amount = "";
        swiggyItem4[0] = item1;

        SwiggyItem4 item2 = new SwiggyItem4();
        item2.dishName = "";
        item2.subDish = "";
        item2.amount = "";
        swiggyItem4[1] = item2;

        SwiggyItem4 item3 = new SwiggyItem4();
        item3.dishName = "";
        item3.subDish = "";
        item3.amount = "";
        swiggyItem4[2] = item3;

        SwiggyItem4 item4 = new SwiggyItem4();
        item4.dishName = "";
        item4.subDish = "";
        item4.amount = "";
        swiggyItem4[3] = item4;

        SwiggyItem4 item5 = new SwiggyItem4();
        item5.dishName = "";
        item5.subDish = "";
        item5.amount = "";
        swiggyItem4[4] = item5;

        SwiggyItem4 item6 = new SwiggyItem4();
        item6.dishName = "";
        item6.subDish = "";
        item6.amount = "";
        swiggyItem4[5] = item6;

        SwiggyItem4 item7 = new SwiggyItem4();
        item7.dishName = "";
        item7.subDish = "";
        item7.amount = "";
        swiggyItem4[6] = item7;
    }

    private void initViews() {
        swiggy4Rv = findViewById(R.id.swiggy_four_rv);
    }
}