package com.example.xmlparsingrssfeedhttpurlconnections

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmlparsingrssfeedhttpurlconnections.databinding.ItemRowBinding
import com.squareup.picasso.Picasso

class RVAdapter(val gameList : ArrayList<RssData>): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder(val Binding : ItemRowBinding): RecyclerView.ViewHolder(Binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
     return ItemViewHolder(
         ItemRowBinding.inflate(
             LayoutInflater.from(parent.context),
             parent,
             false
         )
     )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val games = "https://news.xbox.com${gameList[position].img}"

        holder.Binding.apply {

            Log.d("Arraygame", "${games}")
            titlerss.text = gameList[position].titleGame


            Picasso.get().load(games).into(imagegame)

        }

    }

    override fun getItemCount(): Int {
       return gameList.size
    }
}