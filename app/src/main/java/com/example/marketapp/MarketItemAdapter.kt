package com.example.marketapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MarketItemAdapter(private val listMarketItem: ArrayList<MarketItem>): RecyclerView.Adapter<MarketItemAdapter.ViewHolder>(){
    override fun getItemCount(): Int {
        return listMarketItem.size;
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvMarketItemName: TextView = view.findViewById(R.id.tv_name);
        val tvMarketItemDescription: TextView = view.findViewById(R.id.tv_description);
        val ivMarketItemImage: ImageView = view.findViewById(R.id.iv_image);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_market_item, parent, false);

        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvMarketItemName.setText(listMarketItem[position].name);
        holder.tvMarketItemDescription.setText(listMarketItem[position].description);
        holder.ivMarketItemImage.setBackgroundResource(holder.itemView.getResources().getIdentifier(listMarketItem[position].image, "drawable", holder.itemView.getContext().getPackageName()));
    }
}