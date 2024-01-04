package com.example.onepassword.adapter

import android.text.SpannableString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onepassword.R

class ViewPagerAdapter(
    private val title: List<SpannableString>,
    private val details: List<String>
) : RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {

    class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText: TextView = itemView.findViewById(R.id.generateSecure)
        val detail: TextView = itemView.findViewById(R.id.descriotion)

        fun bindTitle(title: SpannableString) {
            titleText.text = title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        return PagerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.viewpager_items, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bindTitle(title[position])
        holder.detail.text = details[position]
    }
}
