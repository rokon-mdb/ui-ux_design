package com.example.myapplication.adapter

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.Levels

class LevelAdapter (private val context: Context, private val dataList: List<Levels>) :
    RecyclerView.Adapter<LevelAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_level)
        val lock: ImageView = itemView.findViewById(R.id.iv_lock)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_level, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        val path = data.imagePath

        holder.imageView.setImageResource(path)

        if(!data.lock){
            holder.lock.visibility = View.GONE
        }

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}