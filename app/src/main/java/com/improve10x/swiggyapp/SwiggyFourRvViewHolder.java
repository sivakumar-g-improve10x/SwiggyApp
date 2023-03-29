package com.improve10x.swiggyapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyFourRvViewHolder extends RecyclerView.ViewHolder {
    public TextView dishName;
    public TextView subDish;
    public TextView amount;
    public SwiggyFourRvViewHolder(@NonNull View itemView) {
        super(itemView);
        dishName = itemView.findViewById(R.id.dish_name);
        subDish = itemView.findViewById(R.id.sub_dish_txt);
        amount = itemView.findViewById(R.id.amount_txt);
    }
}
