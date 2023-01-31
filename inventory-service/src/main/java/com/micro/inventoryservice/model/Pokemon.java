package com.micro.inventoryservice.model;

public class Pokemon {
    private Integer id;
    private String name;
    private Integer xp;
    private String type;
    private Integer lifePoint;
    private Integer combatPoint;

    public Pokemon(){
        this.id = 1;
        this.name = "Pikachu";
        this.xp = 0;
        this.type = "Electric";
        this.lifePoint = 100;
        this.combatPoint = 20;
    }
    public Pokemon(int id, String name, int xp, String type, int lifePoint, int combatPoint){
        this.id = id;
        this.name = name;
        this.xp = xp;
        this.type = type;
        this.lifePoint = lifePoint;
        this.combatPoint = combatPoint;
    }

    public String stringify(){
        String stringJson = "";
        stringJson = "{\"id\":\""+ getId()+"\",\"name\":\""+getName() +"\",\"xp\":\""+getXp() +"\",\"type\":\""+ getType()+"\"," +
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
