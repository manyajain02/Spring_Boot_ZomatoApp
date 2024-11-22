package com.springboot.Project.ZomatoApp.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String name;

   private String description;

   private Long price;

   // category entity
    @ManyToOne
    private Category foodCategory;

    @Column(length = 1000)
    private List<String> images;

    private boolean available;
    @ManyToOne
    private Restaurant restaurant;

    private String isVegetarian;

    @ManyToMany
    private List<IngredientItems> ingredient = new ArrayList<>();

    private LocalDateTime creationTime;
}
