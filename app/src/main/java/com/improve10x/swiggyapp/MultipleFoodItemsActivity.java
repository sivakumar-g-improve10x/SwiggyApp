package com.improve10x.swiggyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MultipleFoodItemsActivity extends AppCompatActivity {
RecyclerView foodRv;
public FoodItem[] foodItems;
public FoodRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_food_items);
        initView();
        createFoodData();
        setupAdapter();
        connectAdapter();
        setupClickListener();
    }

    private void setupClickListener() {
        adapter.foodItemListener = new OnClickMultipleFoodItemListener() {
            @Override
            public void onMultiClickListener(FoodItem item) {
                Toast.makeText(MultipleFoodItemsActivity.this, item.itemName, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MultipleFoodItemsActivity.this,MainActivity.class);
                startActivity(intent);
            }

        };
    }

    private void connectAdapter() {
   foodRv.setLayoutManager(new LinearLayoutManager(this));
   foodRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new FoodRvAdapter(foodItems);

    }

    private void createFoodData() {
    foodItems = new FoodItem[7];

        FoodItem item1 = new FoodItem();
        item1.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item1.itemName = "Aasife Biriyani ";
        item1.items = "Biryani, Tandoon & Chinese";
        item1.percentage = "-40%";
        item1.rating = "4.5 ✳";
        item1.time = "30 Min";
        foodItems[0] = item1;

        FoodItem item2 = new FoodItem();
        item2.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item2.itemName = "Akshaya Pure Veg";
        item2.items = "South Indian & Chinese\n";
        item2.percentage = "Veg";
        item2.rating = "4.0❇";
        item2.time = "30Min";
        foodItems[1] = item2;

        FoodItem item3 = new FoodItem();
        item3.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item3.itemName = "Al Ajwain";
        item3.items = "Chinese, Tandoori & Indian";
        item3.percentage = "3oMin";
        item3.rating = "4.7❇";
        item3.time = "";
        foodItems[2] = item3;

        FoodItem item4 = new FoodItem();
        item4.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item4.itemName = "Anjappar";
        item4.items = "Chinese, Tandoor & Indian";
        item4.percentage = "sample";
        item4.rating = "3.2⭐ ";
        item4.time = "45 Min";
        foodItems[3] = item4;

        FoodItem item5 = new FoodItem();
        item5.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item5.itemName = "Cakes & Berrys";
        item5.items = "Cakes, Sweets & Snacks";
        item5.percentage = "-25%";
        item5.rating = "4.5 ❇";
        item5.time = "45 Min";
        foodItems[4] = item5;

        FoodItem item6 = new FoodItem();
        item6.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item6.itemName = "Copper Kitchen";
        item6.items = "Chettinadu, Chinese, Tandoori &\n";
        item6.percentage = "-10%";
        item6.rating = "3.3 ⭐";
        item6.time = "45 Min";
        foodItems[5] = item6;

        FoodItem item7 = new FoodItem();
        item7.biriyani = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item7.itemName = "SS Pandian";
        item7.items = "Chettinada, Chinese, Tandoori &";
        item7.percentage = "";
        item7.rating = "4.2 ✳";
        item7.time = "30 Min";
        foodItems[6] = item7;


    }

    private void initView() {
        foodRv = findViewById(R.id.food_rv);
    }
}