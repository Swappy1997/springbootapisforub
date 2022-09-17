package com.example.demo5.repository;

import com.example.demo5.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StateRepository extends JpaRepository<StateEntity,Integer> {
    @Query(value ="select district_name  from states_tb where state_id=:state_id",nativeQuery = true)
    String getDistrict(@Param("state_id") int state_id);
}
