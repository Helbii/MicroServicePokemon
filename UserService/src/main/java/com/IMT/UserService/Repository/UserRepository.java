package com.IMT.UserService.Repository;

import com.IMT.UserService.Model.UserH2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserH2, Integer> {

    public UserH2 findUserH2ById(Integer id);

}