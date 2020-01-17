package com.example.snakerproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.snakerproject.R
import com.example.snakerproject.Snakerdataclass


class SnakerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{
    var snakernum=itemView.findViewById<TextView>(R.id.txt_number)
    var snakertext=itemView.findViewById<TextView>(R.id.txt_text)
    var image=itemView.findViewById<ImageView>(R.id.img_snaker)
    var snakermoney=itemView.findViewById<TextView>(R.id.txt_money)
}

class SnakerAdapter (val snakerlist : ArrayList<Snakerdataclass>):RecyclerView.Adapter<SnakerViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnakerViewHolder {

        val view= LayoutInflater.from(parent.context).inflate(R.layout.snaker,parent,false)

        return SnakerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return snakerlist.size
    }

    override fun onBindViewHolder(holder: SnakerViewHolder, position: Int) {

        holder.snakernum.text=snakerlist[position].snakernum
        holder.snakertext.text=snakerlist[position].snakertext
        holder.image.setImageResource(snakerlist[position].image)
        holder.snakermoney.text=snakerlist[position].snakermoney.toString()
    }

}