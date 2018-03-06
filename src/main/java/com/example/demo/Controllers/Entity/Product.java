package com.example.demo.Controllers.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    String name;
    float price;
    String brand;
    String category;
    int quantity;
    String type;

    public Product(String name, float price, String brand, String category, int quantity, String type) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.quantity = quantity;
        this.type = type;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
