package com.micro.service.userservice.web.controller;

import UserService\src\main\java\com\IMT\UserService\Repository\UserInformationRepo.java;
import UserService\src\main\java\com\IMT\UserService\Model\UserModel.java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userInformation")
public class UserController {

    @Autowired
    private UserInformationRepo userInformationRepo;

    @PostMapping()
    public UserInformation createUser (@RequestBody UserInformation userInformation) {
        userInformation.setLevel(0);
        userInformation.setExp(0);
        userInformation.setGold(0);
        return userInformationRepo.save(userInformation)
    }

    @GetMapping("/{id}")
    public UserInformation getTransactions() {
        return userInformationRepo.findById();
    }

    @DeleteMapping("/{id}")
    public String deleteTransactionById(@PathVariable int id)   {
        return userTransactionRepo.deleteUserTransaction(id);
    }
}