package com.smartcart.model;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    // getter
    public String getName() { return name;}
    public double getPrice() { return price;}
    public int getStockQuantity() { return stockQuantity;}


    // setter
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) { this.price = price;}
    public void setStockQuantity(int stockQuantity) { this.stockQuantity=stockQuantity;}

    public Product(String name, double price, int stockQuantity){
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}