package com.example.fishermanguide.base

import android.app.LauncherActivity
import com.example.fishermanguide.R

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MyAdaptar(listArray:ArrayList<ListItem>, context: Context): RecyclerView.Adapter<MyAdaptar.ViewHolder>()  {

    var listArrarR = listArray
    var contextR = context


    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvContent = view.findViewById<TextView>(R.id.text_view_content)
        val im = view.findViewById<ImageView>(R.id.image_view)

        fun bind(listItem: ListItem, context: Context)
        {
            tvContent.text = listItem.content_view
            im.setImageResource(listItem.image_id)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        return ViewHolder(
            inflater.inflate(
                R.layout.my_history_card,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listArrarR.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listArrarR.get(position)
        holder.bind(listItem, contextR)
    }
}

