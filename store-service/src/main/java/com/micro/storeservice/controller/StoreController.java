package com.micro.storeservice.controller;
import com.micro.storeservice.storeService;
import com.micro.storeservice.model.Eggs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.micro.storeservice.repository.EggsRepository;
@RestController
public class StoreController {
    //private List<Eggs> eggsList = new ArrayList<Eggs>() ;

  @Autowired
  private storeService storeService;
    @CrossOrigin()
    @GetMapping("/storebuyegg/{userId}")
    public @ResponseBody String buyEgg(@PathVariable("userId") Integer userId,@RequestParam(name="eggName", required = true) String eggName){
      String jsonString = storeService.storeBuyEggs(eggName);
      return jsonString;
    }
    @GetMapping("/storeselleggs/{userId}")
    public @ResponseBody String sellEgg(@PathVariable("userId") Integer userId, @RequestParam(name="eggName", required = true) String eggName)
    {
      String jsonString = storeService.storeSellEggs(eggName);
      return jsonString;
    }
    @GetMapping("/displayalleggs")
    public @ResponseBody String allEggs() {
      return storeService.displayAllEggs();
    }




}
