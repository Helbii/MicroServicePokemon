package com.IMT.DresseurService.Model;

import jakarta.persistence.*;

@Entity
public class Pokemon {
    @Id
    private Integer id;
    private String name;
    private Integer xp;
    private String type;
    private Integer life_Point;
    private Integer combat_Point;

    public Integer getCombatPoint() {
        return combat_Point;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLifePoint(Integer life_Point) {
        this.life_Point = life_Point;
    }

    public void setCombatPoint(Integer combat_Point) {
        this.combat_Point = combat_Point;
    }
    public String getName() {
        return name;
    }

}