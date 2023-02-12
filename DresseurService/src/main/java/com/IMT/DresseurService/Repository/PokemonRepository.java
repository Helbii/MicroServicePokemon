package com.IMT.DresseurService.Repository;

import com.IMT.DresseurService.Model.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {
    public Pokemon findPokemonById(Integer id);
}
