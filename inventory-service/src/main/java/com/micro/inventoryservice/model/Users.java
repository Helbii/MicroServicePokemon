package com.micro.inventoryservice.model;

import jakarta.persistence.*;

@Entity
public class Users {
    @Id

    private Integer id;
    private String name;
    private Integer gold;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getGold() { return gold; }
    public void setGold(Integer gold) { this.gold = gold; }

}
