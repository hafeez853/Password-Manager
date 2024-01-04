package com.example.onepassword.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onepassword.R
import com.example.onepassword.dataclasses.DataList

class MainRecycler(private val itemList: ArrayList<DataList>) :
    RecyclerView.Adapter<MainRecycler.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val webimg: ImageView = itemView.findViewById(R.id.webImg)
        val webtext: TextView = itemView.findViewById(R.id.webText)
        val copyImg: ImageView = itemView.findViewById(R.id.copyImg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.websites_lists, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.webimg.setImageResource(currentItem.image1)
        holder.webtext.text = currentItem.name
        holder.copyImg.setImageResource(currentItem.image2)


    }
}