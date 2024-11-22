package com.springboot.Project.ZomatoApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class IngredientItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private IngredientCategory category;

//    private OrderItems orderItems;

    @JsonIgnore
    @ManyToOne
    private  Restaurant restaurant;

    private  boolean inStock= true;
}
