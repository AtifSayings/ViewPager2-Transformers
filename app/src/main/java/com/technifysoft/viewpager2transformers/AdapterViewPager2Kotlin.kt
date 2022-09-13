package com.technifysoft.viewpager2transformers

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton

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

        try {
            Glide.with(context)
                .load(image)
                .placeholder(R.color.teal_200)
                .into(holder.imageView)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        holder.contactBtn.setOnClickListener { contactUs() }

    }

    private fun contactUs() {
        val webIntent = Intent(Intent.ACTION_VIEW)
        val url = "https://technifysoft.com/"
        webIntent.data = Uri.parse(url)
        context.startActivity(webIntent)
    }

    override fun getItemCount(): Int {
        return viewPager2JavaArrayList.size
    }

    inner class HolderViewPager2Kotlin(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView
        val contactBtn: MaterialButton

        init {
            imageView = itemView.findViewById(R.id.imageIv)
            contactBtn = itemView.findViewById(R.id.contactBtn)
        }
    }
}