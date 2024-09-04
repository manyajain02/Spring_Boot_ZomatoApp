package com.springboot.Project.ZomatoApp.entities;

import jakarta.persistence.*;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String name;



}
