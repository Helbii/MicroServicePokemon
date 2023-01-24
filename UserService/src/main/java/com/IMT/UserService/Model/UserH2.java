package com.IMT.UserService.Model;

import jakarta.persistence.*;

@Entity
public class UserH2 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "USERS_SEQ", allocationSize = 1)

    private Integer id;
    private String name;
    private Integer gold;
    private Integer experience;
    private Integer levels;


    public Integer getLevels() {
        return levels;
    }
    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getGold() { return gold; }
    public void setGold(Integer gold) { this.gold = gold; }

}
