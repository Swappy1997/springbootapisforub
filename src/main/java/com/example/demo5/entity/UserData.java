package com.example.demo5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users_tb")

public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int user_id;
    @Column(name = "fist")
    String first_name;
    String last_name;
    String profile_created_by;
    String user_stated;
    String lang_known;
    String gender;
    String heightIn_cm;
    String heightIn_ft;
    String user_education;
    String user_stream;
    String employement_type;
    String user_occupations;
    String anual_Income;
    String marital_status;
    String family_type;
    String father_job;
    String mother_job;
    String bother_no;
    String sister_no;
    String bother_no_married;
    String sister_no_married;
    String user_dob;
    String photo1;
    String photo2;
    String photo3;
    String photo4;
    String photo5;
}
