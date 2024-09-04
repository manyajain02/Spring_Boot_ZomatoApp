package com.springboot.Project.ZomatoApp.entities;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private User user;

    private Double rating;

//    @Column(columnDefinition = "Geometry(Point, 4326)")
//    private Point currentLocation;

}