package com.technifysoft.viewpager2transformers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterViewPager2Java extends RecyclerView.Adapter<AdapterViewPager2Java.HolderViewPager2Java> {

    private Context context;
    private ArrayList<ModelViewPager2Java> viewPager2JavaArrayList;

    AdapterViewPager2Java(Context context, ArrayList<ModelViewPager2Java> viewPager2JavaArrayList) {
        this.context = context;
        this.viewPager2JavaArrayList = viewPager2JavaArrayList;
    }

    @NonNull
    @Override
    public HolderViewPager2Java onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_pager2_item, parent, false);

        return new HolderViewPager2Java(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderViewPager2Java holder, int position) {
        ModelViewPager2Java model = viewPager2JavaArrayList.get(position);

        int image = model.getImage();

        holder.imageView.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return viewPager2JavaArrayList.size();
    }

    class HolderViewPager2Java extends RecyclerView.ViewHolder {

        private ImageView imageView;

        HolderViewPager2Java(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageIv);
        }

    }

}