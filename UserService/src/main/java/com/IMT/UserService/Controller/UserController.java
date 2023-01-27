package com.IMT.UserService.Controller;

import com.IMT.UserService.Model.UserH2;
import com.IMT.UserService.Service.UserService21;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.IMT.UserService.Repository.*;

@RestController
@RequestMapping("/l")
public class UserController {

    @Autowired
    private UserRepository userInformationRepo;
    @Autowired
    private UserService21 userService21;

    @PostMapping(path="/add")
    public @ResponseBody UserH2 addNewUser(
            @RequestParam String name,
            @RequestParam Integer gold,
            @RequestParam Integer experience,
            @RequestParam Integer levels) {

        // A factoriser dans save ou createUser
        final UserH2 userH2 = new UserH2();
        userH2.setName(name);
        userH2.setGold(gold);
        userH2.setLevels(levels);
        userH2.setExperience(experience);

        return userService21.save(userH2);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserH2> getAllUsers() {
        // This returns a JSON or XML with the users
        return userService21.getAllUsers();
    }

    @GetMapping(path = "/userInformation/{id}")
    public UserH2 getUserInformation(@PathVariable("id") Integer id){
        return userService21.getUserInformation(id);
    }
}