package com.example.hackfit2021

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class blogAdapter: RecyclerView.Adapter<blogAdapter.ViewHolder>() {
    private var titles = arrayOf("Blog 1","Blog 2","Blog 3","Blog 4","Blog 5")
    private var description = arrayOf("desc 1","desc 2","desc 3","desc 4","desc 5")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): blogAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.blog_card_view,parent,false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: blogAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position];
        holder.itemDescription.text = description[position];
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemTitle: TextView
        var itemDescription: TextView

        init{
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDescription = itemView.findViewById(R.id.item_description);
        }
    }
}