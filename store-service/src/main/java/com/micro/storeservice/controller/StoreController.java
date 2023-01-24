package com.micro.storeservice.controller;
import com.micro.storeservice.storeService;
import com.micro.storeservice.model.Eggs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import com.micro.storeservice.repository.EggsRepository;
@RestController
public class StoreController {
    //private List<Eggs> eggsList = new ArrayList<Eggs>() ;

  @Autowired
  private storeService storeService;


    /*public List<Eggs> getEggList(){
        List<Eggs> eggsList = new ArrayList<Eggs>();
        eggsList.add(new Eggs());
        eggsList.add(new Eggs(13, "Bulbasaur", 33));
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


    }*/

    @CrossOrigin()
    /*@GetMapping("/eggs")
    public ResponseEntity<String> eggList() {
        return ResponseEntity.ok("Egg1");
    }

    @GetMapping("/eggSellPrice")
    public ResponseEntity<String> eggSellList() {
        return ResponseEntity.ok(getEggsListToJson());
    }*/
    @GetMapping("/userSellEggs/{userId}")
    public String sellEggs(@PathVariable("eggName") String eggName, @RequestParam(name="name", required = true, defaultValue = "1") Integer eggPrice,@RequestParam(name="name", required = true, defaultValue = "1") Integer userId){
      Eggs eggs = new Eggs(eggPrice+10, eggName);


      String msg = "User:"+userId+"";
      return msg;
    }

    @GetMapping("/buyEggs/{userId}")
    public String buyEggs(@RequestParam(name="name", required = true, defaultValue = "Charminder") String eggName, @PathVariable("userId") Integer userId)
    {
      Eggs egg = storeService.getEggsByName(eggName);
      String msg = "user:"+userId+" buyed an "+egg.getName()+" egg for "+egg.getPrice()+" Pokedollars";
      return msg;
    }
    @GetMapping("/getAllEggs")
    public @ResponseBody Iterable<Eggs> getAllEggs() {
      return storeService.getAllEggs();
    }




}
