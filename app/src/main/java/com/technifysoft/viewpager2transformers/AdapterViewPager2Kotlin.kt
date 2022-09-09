package com.technifysoft.viewpager2transformers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterViewPager2Kotlin internal constructor(
    private val context: Context,
    private val viewPager2JavaArrayList: ArrayList<ModelViewPager2Kotlin>
) : RecyclerView.Adapter<AdapterViewPager2Kotlin.HolderViewPager2Kotlin>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderViewPager2Kotlin {
        val view = LayoutInflater.from(context).inflate(R.layout.view_pager2_item, parent, false)
        return HolderViewPager2Kotlin(view)
    }

    override fun onBindViewHolder(holder: HolderViewPager2Kotlin, position: Int) {

        val model = viewPager2JavaArrayList[position]
        val image = model.image

        holder.imageView.setImageResource(image)
    }

    override fun getItemCount(): Int {
        return viewPager2JavaArrayList.size
    }

    inner class HolderViewPager2Kotlin(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView

        init {
            imageView = itemView.findViewById(R.id.imageIv)
        }
    }
}