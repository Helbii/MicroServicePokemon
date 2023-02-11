package com.micro.inventoryservice.repository;
import com.micro.inventoryservice.model.Pokemons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonsRepository extends CrudRepository<Pokemons, Integer > {
    public Pokemons findPokemonByName(String Name);
    public List<Pokemons> findPokemonByUserid(Integer userid);

    public Pokemons findPokemonsByUseridAndId(Integer userid, Integer id);
}
