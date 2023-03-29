package com.improve10x.swiggyapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggySixRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView foodIv;
    public TextView discountTxt;
    public TextView dishTxt;
    public TextView biriyaniDishTxt;
    public TextView rating1Txt;
    public TextView timeTxt;
    public SwiggySixRvViewHolder(@NonNull View itemView) {
        super(itemView);
        foodIv = itemView.findViewById(R.id.food_iv);
        discountTxt = itemView.findViewById(R.id.discout_txt);
        dishTxt = itemView.findViewById(R.id.dish_txt);
        biriyaniDishTxt = itemView.findViewById(R.id.biriyani_dish_txt);
        rating1Txt = itemView.findViewById(R.id.rating1_txt);
        timeTxt = itemView.findViewById(R.id.time1_txt);
    }
}
