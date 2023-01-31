package com.micro.storeservice.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
@Entity
public class Eggs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "egg_generator")
    @SequenceGenerator(name = "egg_generator", sequenceName = "egg_seq", allocationSize = 1)
    private Integer id;
    private int price;
    private String name;

    private int due_time;

    private LocalDate creation_date;

    public Eggs(int price, String name){
        //setId(id);

        setCreationDate();
        setDueTime();
        setPrice(price);
        setName(name);
    }

    public Eggs() {

    }

    private void setPrice(int price){
        this.price = price;
    }
    private void  setName(String name){
        this.name = "egg "+name;
    }

    private void setDueTime(){
        Random rd = new Random();
        this.due_time = rd.nextInt(3600, 7200); }

    private void setCreationDate(){this.creation_date = LocalDate.now(); }
    private void setId(int id) { this.id = id;
    }

    public int getDue_time() {
        return due_time;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){ return this.id; }
    public String getNamePrice(){
        return getName() +" : "+getPrice();
    }
    public String stringify(){
        return "{\"id\":\""+getId()+"\",\"name\":\""+getName()+"\"," +
                "\"price\":\""+getPrice()+"\",\"due_time\":\""+getDue_time()+"\"" +
                ",\"creation_date\":\""+getCreation_date()+"\"}";
    }

}
