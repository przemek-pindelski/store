package com.example.store;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shipping {

    private String type;
    private Integer price;

    public  Shipping(){

    }

    public Shipping(String type, Integer price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
