package com.IMT.DresseurService.Repository;

import com.IMT.DresseurService.Model.Dresseur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DresseurRepository extends CrudRepository<Dresseur, Integer> {

}
