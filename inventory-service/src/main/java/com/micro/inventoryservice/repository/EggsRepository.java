package com.micro.inventoryservice.repository;
import com.micro.inventoryservice.model.Eggs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EggsRepository extends CrudRepository<Eggs, Integer> {
  public Eggs findEggsByName(String Name);
  public List<Eggs> findEggsByUserid(Integer UserId);
  public Integer deleteEggsById(Integer Id);
  //public Eggs deleteEggs(Eggs eggs);


}
