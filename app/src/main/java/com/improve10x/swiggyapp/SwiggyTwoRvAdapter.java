package com.improve10x.swiggyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyTwoRvAdapter extends RecyclerView.Adapter<SwiggyTwoRvViewHolder> {
    public Fooditem2[] items;

    public SwiggyTwoRvAdapter(Fooditem2[] fooditem2) {
        items = fooditem2;
    }

    @NonNull
    @Override
    public SwiggyTwoRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_two_item, parent, false);
        SwiggyTwoRvViewHolder ViewHolder = new SwiggyTwoRvViewHolder(view);
        return ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyTwoRvViewHolder holder, int position) {
        Fooditem2 item = items[position];
        holder.dish1Txt.setText(item.dish1);
        holder.dishName1Txt.setText(item.dishName1);
        holder.amout1.setText(item.amount1);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
