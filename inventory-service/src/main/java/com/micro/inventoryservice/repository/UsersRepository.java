package com.micro.inventoryservice.repository;
import com.micro.inventoryservice.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
    public Users findUserById(Integer id);
    public Void removeById(Integer id);
}
