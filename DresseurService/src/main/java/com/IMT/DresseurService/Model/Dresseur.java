package com.IMT.DresseurService.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Dresseur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dresseur_generator")
    @SequenceGenerator(name = "dresseur_generator", sequenceName = "DRESSEUR_SEQ", allocationSize = 1)
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    /*public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }*/

}