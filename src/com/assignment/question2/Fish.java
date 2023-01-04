package com.assignment.question2;

import java.util.Scanner;

public class Fish {
    String name;
    String sauce;
    int price;
    int quantity;
    int price_sauce;

    public  Fish(String name ,String sauce,int price , int price_sauce , int quantity ){
        this.name = name;
        this.sauce = sauce;
        this.price=price;
        this.quantity=quantity;
        this.price_sauce = price_sauce;

    }
    public  String description () {
        return "The name of fish is "+ name + " and price is $" + price + ". The quantity of sauces is "+ quantity ;

    }



    public double getCalbill(){
        return    price =  price + (price_sauce *quantity);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice_sauce() {
        return price_sauce;
    }

    public void setPrice_sauce(int price_sauce) {
        this.price_sauce = price_sauce;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
