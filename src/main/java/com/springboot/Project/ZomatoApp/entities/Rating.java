package com.springboot.Project.ZomatoApp.entities;

import jakarta.persistence.Entity;

@Entity
public class Rating {
    private Long rideId;
    private Integer rating;
}
