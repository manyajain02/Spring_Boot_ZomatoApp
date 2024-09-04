package com.springboot.Project.ZomatoApp.entities;

import com.springboot.Project.ZomatoApp.dto.UserDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    private Long id;

    private UserDto user;

    private Double rating;

    private Boolean available;

    private String vehicleId;
}


