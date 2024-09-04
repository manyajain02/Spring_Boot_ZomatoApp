package com.springboot.Project.ZomatoApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.Project.ZomatoApp.entities.enums.PaymentMethod;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User customer;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

//    private MenuItem items;

    private Double totalAmount;

    private String status;

    private LocalDateTime createdTime;

//    private PointDto deliveryLocation;

//    private List<OrderItems> items;

    private PaymentMethod paymentMethod;

    private int totalPreparationTime;
//    private String otp;

//    Methods: calculateTotal(), updateStatus())
}
