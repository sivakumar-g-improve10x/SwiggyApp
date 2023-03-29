package com.improve10x.swiggyapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodRvViewHolder extends RecyclerView.ViewHolder {
public ImageView biriyaniIv;
public TextView itemName;
public TextView itemsTxt;
public TextView percentageTxt;
public TextView ratingTxt;
public TextView TimeTxt;
    public FoodRvViewHolder(@NonNull View itemView) {
        super(itemView);
        biriyaniIv = itemView.findViewById(R.id.biriyani_iv);
        itemName = itemView.findViewById(R.id.item_name1_txt);
        itemsTxt = itemView.findViewById(R.id.items_txt);
        percentageTxt = itemView.findViewById(R.id.percentage_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        TimeTxt = itemView.findViewById(R.id.time_txt);

    }
}
