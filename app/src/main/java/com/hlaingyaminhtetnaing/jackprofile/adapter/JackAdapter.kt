package com.hlaingyaminhtetnaing.jackprofile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlaingyaminhtetnaing.jackprofile.R
import com.hlaingyaminhtetnaing.jackprofile.model.Jack
import kotlinx.android.synthetic.main.item_eachofme.view.*

class JackAdapter(var jackList: ArrayList<Jack>) :
    RecyclerView.Adapter<JackAdapter.jackViewHolder>() {
    class jackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jack: Jack) {
            itemView.ImgRe.setImageResource(jack.imgJack)
            itemView.txtRe.text = jack.textName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): jackViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_eachofme, parent, false)
        return jackViewHolder(view)
    }

    override fun getItemCount(): Int = jackList.size

    override fun onBindViewHolder(holder: jackViewHolder, position: Int) {
        holder.bind(jackList[position])
    }
}