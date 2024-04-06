package com.example.marketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marketItems = ArrayList<MarketItem>();
        marketItems.add(MarketItem("Banana", "Banana is a long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.", "banana"));

         val recyclerView = findViewById<RecyclerView>(R.id.rv_market_list);
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.adapter = MarketItemAdapter(marketItems);

    }
}