package com.micro.inventoryservice.model;

import jakarta.persistence.*;

@Entity
public class Pokemons {

    @Id
    private Integer id;
    private String name;
    private Integer xp;
    private String type;
    private Integer lifePoint;
    private Integer combatPoint;
    private Integer userid;


    public Pokemons(){
        this.userid = null;
        this.id = 1;
        this.name = "Pikachu";
        this.xp = 0;
        this.type = "Electric";
        this.lifePoint = 100;
        this.combatPoint = 20;
    }
    public Pokemons(int id, String name, int xp, String type, int lifePoint, int combatPoint){
        this.userid = null;
        this.id = id;
        this.name = name;
        this.xp = xp;
        this.type = type;
        this.lifePoint = lifePoint;
        this.combatPoint = combatPoint;
    }


    public void setUserid(Integer userid){
        this.userid = userid;
    }

    public Integer getUserid(){
        return this.userid;
    }

    public String stringify(){
        String stringJson = "";
        stringJson = "{\"id\":\""+ getId()+"\",\"user_id\" :\""+getUserid()+"\",\"name\":\""+getName() +"\",\"xp\":\""+getXp() +"\",\"type\":\""+ getType()+"\"," +
                "\"life_point\":\""+getLifePoint() +"\",\"combat_point\":\""+ getCombatPoint()+"\"}";
        return stringJson;
    }

    public Integer getCombatPoint() {
        return combatPoint;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLifePoint() {
            return lifePoint;
    }

    public Integer getXp() {
        return xp;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}
