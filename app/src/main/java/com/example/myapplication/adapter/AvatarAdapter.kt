package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Avatar

class AvatarAdapter (private val context: Context, private val dataList: List<Avatar>) :
    RecyclerView.Adapter<AvatarAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_item_profile)
        val frameView: ImageView = itemView.findViewById(R.id.iv_item_frame)
        val name: TextView = itemView.findViewById(R.id.tv_item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_avatar, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        val image = data.image
        val frame = data.frame

        holder.imageView.setImageResource(image)
        holder.frameView.setImageResource(frame)

        holder.name.text = data.name
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}