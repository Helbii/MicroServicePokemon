package com.micro.storeservice.repository;
import com.micro.storeservice.model.Eggs;
import org.springframework.data.repository.CrudRepository;

import javax.lang.model.element.Name;

public interface EggsRepository extends CrudRepository<Eggs, Integer> {
  public Eggs findEggsByName(String Name);

}
