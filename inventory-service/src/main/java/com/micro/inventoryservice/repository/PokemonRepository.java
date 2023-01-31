package com.micro.inventoryservice.repository;
import com.micro.inventoryservice.model.Pokemon;

public interface PokemonRepository {
    public Pokemon findPokemonByName(String Name);
}
