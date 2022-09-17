package com.example.demo5.controller;

import com.example.demo5.entity.UserData;
import com.example.demo5.services.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserDataCotroller {
    @Autowired
    private UserDataService userDataService;

    @PostMapping("/adduser")
    public UserData adduser(@RequestBody UserData userData){
        return userDataService.saveUser(userData);
    }
    @PostMapping("/addusers")
    public List<UserData> addUsers(@RequestBody List<UserData> userData){
        return  userDataService.saveUsers(userData);
    }
    @GetMapping("/allUsers")
    public List<UserData> findAllStates(){
        return userDataService.getAllusers();
    }
//    @GetMapping("/c/{id}")
//    public UserData findById(@PathVariable int id){
//        return userDataService.getUserById(id);
//    }
}
