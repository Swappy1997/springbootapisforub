package com.example.demo5.repository;

import com.example.demo5.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData,Integer> {

}
