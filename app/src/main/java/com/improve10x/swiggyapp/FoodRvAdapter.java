package com.improve10x.swiggyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FoodRvAdapter extends RecyclerView.Adapter<FoodRvViewHolder> {
public FoodItem[] items;
OnClickMultipleFoodItemListener foodItemListener;
public FoodRvAdapter(FoodItem[] foodItems){
    items = foodItems;
}
    @NonNull
    @Override
    public FoodRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_item,parent,false);
        FoodRvViewHolder ViewHolder = new FoodRvViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRvViewHolder holder, int position) {
    FoodItem item = items[position];
   holder.itemName.setText(item.itemName);
   holder.itemsTxt.setText(item.items);
   holder.percentageTxt.setText(item.percentage);
   holder.ratingTxt.setText(item.rating);
   holder.TimeTxt.setText(item.time);
        Picasso.get().load(item.biriyani).into(holder.biriyaniIv);
        holder.itemView.setOnClickListener(v -> {
            foodItemListener.onMultiClickListener(item);
        });
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
