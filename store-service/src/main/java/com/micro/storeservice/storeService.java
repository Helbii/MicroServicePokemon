package com.micro.storeservice;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.micro.storeservice.model.Eggs;
import com.micro.storeservice.repository.EggsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
public class storeService {
  @Autowired
  private EggsRepository eggsRepository;

  public Eggs save(Eggs eggs){
    return eggsRepository.save(eggs);
  }
  public List<Eggs> getAllEggs(){
    return (List<Eggs>) eggsRepository.findAll();
  }
  public Eggs getEggsByName(String name){
    return eggsRepository.findEggsByName(name);
  }
  public String storeBuyEggs(String nameEggs){
    Eggs existingEgg = eggsRepository.findEggsByName(nameEggs);
    Random rdm = new Random();
    int price = rdm.nextInt(50, 100);
    String name = nameEggs;
    String jsonString = "{\"name\":\""+nameEggs+"\",\"price\":\""+price+"\"}";
    if(existingEgg==null){
      Eggs eggs = new Eggs(price, name);
      eggsRepository.save(eggs);
    }
    return jsonString;

  }
  public String storeSellEggs(String nameEggs){
    Eggs existingEggs = eggsRepository.findEggsByName(nameEggs);
    if(existingEggs != null){
      String jsonString = existingEggs.stringify();
      return jsonString;
    }
    else {
      return "{\"error\":\"not_found\"}";
    }
  }

  public String displayAllEggs(){
    List<Eggs> eggsList = getAllEggs();
    String jsonString = "[";
    int size = eggsList.size();
    for(int i = 0; i<size-1; i++){
      Eggs egg = eggsList.get(i);
      jsonString = jsonString + egg.stringify()+"," ;
    }
    jsonString = jsonString + eggsList.get(size-1).stringify() +"]";
    return jsonString;
  }


}
