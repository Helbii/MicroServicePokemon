package com.IMT.DresseurService.Controller;

import com.IMT.DresseurService.Model.Dresseur;
import com.IMT.DresseurService.Model.Pokemon;
import com.IMT.DresseurService.Repository.DresseurRepository;
import com.IMT.DresseurService.Service.DresseurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dresseur")
public class DresseurController {

    @Autowired
    private DresseurRepository dresseurRepository;

    @Autowired
    private DresseurService dresseurService;

    @PostMapping(path = "/add")
    public @ResponseBody Dresseur addNewDresseur(
            @RequestParam String name){

        final Dresseur dresseur = new Dresseur();
        dresseur.setName(name);

        return dresseurService.save(dresseur);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Dresseur> getAllDresseurs() {
        return dresseurService.getAllDresseurs();
    }

    @GetMapping(path = "/equipe")
    public @ResponseBody List<Pokemon> getPokemonEquipe(){
        return dresseurService.getAllPokemons();
    }

    @PutMapping("/{dresseurId}/pokemon/{pokemonId}/attack")
    public @ResponseBody String attackWithPokemon(@PathVariable Integer dresseurId, @PathVariable Integer pokemonId) {

        // On récupère le Pokemon
        Pokemon pokemon = dresseurService.getPokemonById(pokemonId);

        // On vérifie si le dresseur existe dans la base de données
        Optional<Dresseur> dresseur = dresseurRepository.findById(dresseurId);
        if (!dresseur.isPresent()) {
            String dresseurNotFound = "Dresseur not found";
            return dresseurNotFound;
        }
        else { // On execute l'attaque
            return "Le pokemon " + pokemon.getName() + " a attaqué avec une puissance de " + pokemon.getCombatPoint()+ ".";
        }
    }
}
