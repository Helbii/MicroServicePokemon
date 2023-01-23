package com.micro.storeservice.web.controller;

public class Eggs {
    private int price;
    private String name;
    public Eggs(){
        this.price = 10;
        this.name = "eggs Charminder";

    }
    public Eggs(int price, String name){
        setPrice(price);
        setName(name);
    }
    private void setPrice(int price){
        this.price = price;
    }
    private void  setName(String name){
        this.name = "egg "+name;
    }

    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }

    public String getNamePrice(){
        return getName() +" : "+getPrice();
    }
    public String stringify(){
        return "{\"name\":\""+getName()+"\",\"price\":\""+getPrice()+"\"}";
    }

}
