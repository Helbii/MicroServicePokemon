package com.micro.storeservice.web.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.ArrayList;
import java.util.List;


@RestController
public class StoreController {
    private List<Eggs> eggsList = new ArrayList<Eggs>() ;




    public List<Eggs> getEggList(){
        List<Eggs> eggsList = new ArrayList<Eggs>();
        eggsList.add(new Eggs());
        eggsList.add(new Eggs(13, "Bulbasaur"));
        return eggsList;

    }

    private String getEggsListToJson(){
        List<Eggs> eggsList = getEggList();
        int size = eggsList.size();
        Eggs egg ;
        String name;
        int price;
        String jsonString = "{\"eggs\":[";
        for (int i = 0 ; i<size ; i++){
            egg = eggsList.get(i);
            jsonString = jsonString + egg.stringify();
        }
        jsonString = jsonString +"]}";
        return jsonString;


    }

    @CrossOrigin()
    @GetMapping("/eggs")
    public ResponseEntity<String> eggList() {
        return ResponseEntity.ok("Egg1");
    }

    @GetMapping("/eggSellPrice")
    public ResponseEntity<String> eggSellList() {
        return ResponseEntity.ok(getEggsListToJson());
    }



    
}