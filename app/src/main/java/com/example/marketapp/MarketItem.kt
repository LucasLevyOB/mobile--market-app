package com.example.marketapp

class MarketItem {
    lateinit var name: String;
    lateinit var description: String;
    lateinit var image: String;

    constructor(name: String, description: String, image: String) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}