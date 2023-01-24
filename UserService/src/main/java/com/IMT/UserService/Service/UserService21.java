package com.IMT.UserService.Service;

import com.IMT.UserService.Model.UserH2;
import com.IMT.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService21 {
    @Autowired
    private UserRepository userRepository;

    public UserH2 save(UserH2 userH2) {
        return userRepository.save(userH2);
    }

    public List<UserH2> getAllUsers() {
        return (List<UserH2>) userRepository.findAll();
    }

    public UserH2 getUserInformation(Integer id){
        return userRepository.findUserH2ById(id);
    }
}