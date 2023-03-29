package com.improve10x.swiggyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SwiggySixRvAdapter extends RecyclerView.Adapter<SwiggySixRvViewHolder> {
    public SwiggyItem6[] item6s;
    public SwiggySixRvAdapter(SwiggyItem6[] swiggyItem6s){
        item6s = swiggyItem6s;
    }
    @NonNull
    @Override
    public SwiggySixRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy6_item,parent,false);
        SwiggySixRvViewHolder viewHolder = new SwiggySixRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggySixRvViewHolder holder, int position) {
        SwiggyItem6 item6 = item6s[position];
        holder.discountTxt.setText(item6.dicount);
        holder.dishTxt.setText(item6.dish);
        holder.biriyaniDishTxt.setText(item6.biriyaniDish);
        holder.rating1Txt.setText(item6.rating1);
        holder.timeTxt.setText(item6.time1);
        Picasso.get().load(item6.food).into(holder.foodIv);
    }

    @Override
    public int getItemCount() {
        return item6s.length;
    }
}
