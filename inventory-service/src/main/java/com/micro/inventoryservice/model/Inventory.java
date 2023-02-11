package com.micro.inventoryservice.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    Integer userid;
    Integer gold;
    String username;
    List<Pokemons> pokemon;
    List<Eggs> egg;

    public Inventory(){
        this.userid = null;
        this.username = null;
        this.gold = null;
        this.pokemon = null;
        this.egg = null;

    }
    public Inventory(Integer userid, String username , Integer gold, List<Pokemons> pokemon, List<Eggs> egg){
        this.userid = userid;
        this.username = username;
        this.gold = gold;
        this.pokemon = pokemon;
        this.egg = egg;
    }

    public String getUsername(){
        return username;
    }

    public Integer getGold() {
        return gold;
    }

    public Integer getUserid() {
        return userid;
    }

    public List<Eggs> getEgg() {
        return egg;
    }

    public List<String> getAllNameEggs(){
        List<String> listEggsName = new ArrayList<>();
        List<Eggs> listEggs = getEgg();
        int size = listEggs.size();
        for(int i=0; i<size; i++){
            Eggs EGGS = listEggs.get(i);
            listEggsName.add(EGGS.getName());
        }

        return listEggsName;

    }
    public List<String> getAllNamePokemon(){
        List<String> listEggsName = new ArrayList<>();
        List<Pokemons> listPokemon = getPokemon();
        int size = listPokemon.size();
        for(int i=0; i<size; i++){
            Pokemons pokemon = listPokemon.get(i);
            listEggsName.add(pokemon.getName());
        }

        return listEggsName;

    }

    public List<Pokemons> getPokemon() {
        return pokemon;
    }


    public String toString(){

        return "name:"+getUsername()+"\ngold:"+getGold()+" Pokédollars \neggs:"+getAllNameEggs()+"\npokemons:"+getAllNamePokemon();

    }
}
