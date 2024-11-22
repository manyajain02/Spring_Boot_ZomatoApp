package com.springboot.Project.ZomatoApp.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Food food;
    // A single food item (e.g., Pizza) can be ordered multiple times in multiple orders
    // (e.g., two customers order Pizza in different orders).

    private int quantity;

    private Long totalPrice;

    private List<String> ingredients;
}
