package com.micro.inventoryservice.model;

import jakarta.persistence.*;

@Entity
public class Eggs {
    @Id
    private Integer id;
    private String name;
    private Integer userid;

    public Eggs(){
        this.userid = null;
        this.id = 4;
        this.name = "Charminder";

    }
    public Eggs(String name){
        //setId(id);

        setName(name);
    }

    private void  setName(String name){
        this.name = name;
    }

    public void setId(int id) { this.id = id;
    }
    public void setUserid(int userid){
        this.userid = userid;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){ return this.id; }

    public int getUserid(){return this.userid;}

    public String stringify(){
        String id = "\"id\":"+getId()+",";
        String userid = "\"userid\":"+getUserid()+",";
        String name = "\"name\":\""+getName()+"\"";
        return "{"+id+userid+name+"}";
    }

}
