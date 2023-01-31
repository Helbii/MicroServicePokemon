package com.micro.inventoryservice.repository;
import  com.micro.inventoryservice.model.Eggs;
import org.springframework.data.repository.CrudRepository;

public interface EggsRepository extends CrudRepository<Eggs, Integer> {
  public Eggs findEggsByName(String Name);

}
