package com.example.demo5.services;

import com.example.demo5.entity.StateEntity;
import com.example.demo5.entity.UserData;
import com.example.demo5.repository.UserDataRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataService {
    @Autowired
    private UserDataRepository userDataRepository;

public UserData saveUser(UserData userData){
   return userDataRepository.save(userData);

}
    public List<UserData> saveUsers(List<UserData> userData){
        return userDataRepository.saveAll(userData);

    }
    public List<UserData> getAllusers(){
        return   userDataRepository.findAll();
    }

    public UserData getUserById(int id){
        return   userDataRepository.findById(id).orElse(null);
    }
}
