package com.improve10x.swiggyapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyTwoRvViewHolder extends RecyclerView.ViewHolder {
    public TextView dish1Txt;
    public TextView dishName1Txt;
    public TextView amout1;
    public SwiggyTwoRvViewHolder(@NonNull View itemView) {
        super(itemView);
        dish1Txt = itemView.findViewById(R.id.dish1_txt);
        dishName1Txt = itemView.findViewById(R.id.dish_name1_txt);
        amout1 = itemView.findViewById(R.id.amount1_txt);
    }
}
