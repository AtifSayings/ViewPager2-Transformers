package com.technifysoft.viewpager2transformers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;

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

        try {
            Glide.with(context)
                    .load(image)
                    .placeholder(R.color.teal_200)
                    .into(holder.imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactUs();
            }
        });
    }

    private void contactUs(){
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        String url = "https://technifysoft.com/";
        webIntent.setData(Uri.parse(url));
        context.startActivity(webIntent);
    }

    @Override
    public int getItemCount() {
        return viewPager2JavaArrayList.size();
    }

    class HolderViewPager2Java extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private MaterialButton contactBtn;

        HolderViewPager2Java(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageIv);
            contactBtn = itemView.findViewById(R.id.contactBtn);
        }

    }

}