package com.micro.inventoryservice.controller;
import com.micro.inventoryservice.InventoryServiceApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class inventoryController {
    @Autowired
    private InventoryServiceApplication inventoryService;

    @CrossOrigin
    @GetMapping("/displayinventory/{userId}")
    public @ResponseBody String displayInventory(){
        return "inventory";
    }
    @GetMapping("/addegg/{userId}")
    public @ResponseBody String addEgg(){return  "addegg";}
    @GetMapping("/addegg/{userId}")
    public @ResponseBody String deleteEgg(){return  "deleteegg";}

    @GetMapping("/addpokemon/{userId}")
    public @ResponseBody String addPokemon(){
        return "addpokemon";
    }

    @GetMapping("/deletepokemon/{userId}")
    public @ResponseBody String deletePokemon(){
        return "deletepokemon";
    }

    @GetMapping("/addgold/{userId}")
    public @ResponseBody String addGold(){
        return "addgold";
    }

    @GetMapping("/deletegold/{userId}")
    public @ResponseBody String deleteGold(){
        return "deletegold";
    }


}
