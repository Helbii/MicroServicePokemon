package com.micro.inventoryservice.controller;
import com.micro.inventoryservice.model.Eggs;
import com.micro.inventoryservice.service.InventoryService;
import com.micro.inventoryservice.model.Pokemons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class inventoryController {
    @Autowired
    private InventoryService inventoryService;

    @CrossOrigin()
    @GetMapping("/displayinventory/{userId}")
    public @ResponseBody String displayInventory(@PathVariable("userId") Integer userId){
        String inventoryString = inventoryService.getInventoryOfUser(userId);

        return inventoryString;
    }
    @PostMapping("/addegg/{userId}")
    public @ResponseBody String addEgg(@PathVariable("userId") Integer userId,@RequestBody Eggs eggs){
        String eggsString = inventoryService.addEggToInventory(eggs, userId);
        return eggsString;
    }
    @PostMapping("/deleteegg")
    public @ResponseBody String deleteEgg(@RequestBody Eggs eggs){
        String eggsDeleted = inventoryService.removeEggFromInventory(eggs);
        return eggsDeleted;}
    @PostMapping("/removepokemon/{userId}")
    public @ResponseBody String removePokemon(@PathVariable("userId") Integer userId,@RequestBody Pokemons pokemon){
        String pokemondelted = inventoryService.removePokemonFromInventory(userId, pokemon);

        return pokemondelted;
    }

    @PostMapping("/addgold/{userId}")
    public @ResponseBody String addGold(@PathVariable("userId") Integer userId,@RequestParam("gold") Integer gold){
        String newgold = inventoryService.addGoldToUserInventory(userId, gold);
        return newgold;
    }



    @PostMapping("/removegold/{userId}")
    public @ResponseBody String removeGold(@PathVariable("userId") Integer userId, @RequestParam("gold") Integer gold){
        String newgold = inventoryService.removeGoldToUserInventory(userId, gold);
        return newgold;
    }


}
