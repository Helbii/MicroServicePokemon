package com.micro.storeservice;
import com.micro.storeservice.model.Eggs;
import com.micro.storeservice.repository.EggsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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


}
