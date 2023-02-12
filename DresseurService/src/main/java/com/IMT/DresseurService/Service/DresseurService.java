package com.IMT.DresseurService.Service;

import com.IMT.DresseurService.Model.Dresseur;
import com.IMT.DresseurService.Model.Pokemon;
import com.IMT.DresseurService.Repository.DresseurRepository;
import com.IMT.DresseurService.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DresseurService {
    @Autowired
    private DresseurRepository dresseurRepository;
    @Autowired
    private PokemonRepository pokemonRepository;

    public Dresseur save(Dresseur dresseur) {
        return dresseurRepository.save(dresseur);
    }

    public List<Dresseur> getAllDresseurs() {
        return (List<Dresseur>) dresseurRepository.findAll();
    }

    public Pokemon getPokemonById(Integer id) {
        return pokemonRepository.findPokemonById(id);
    }

    public List<Pokemon> getAllPokemons(){
        return (List<Pokemon>) pokemonRepository.findAll();
    }
    /*public UserH2 getUserInformation(Integer id){
        return dresseurRepository.findUserH2ById(id);
    }*/
}