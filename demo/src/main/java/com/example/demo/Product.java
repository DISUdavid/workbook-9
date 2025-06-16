package com.example.demo;

public class Product {
    private int productId;
    private String name;
    private double price;
    private String category;

    public Product(int productId, String name, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

}
