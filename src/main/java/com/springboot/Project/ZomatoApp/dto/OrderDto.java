package com.springboot.Project.ZomatoApp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.Project.ZomatoApp.entities.OrderItems;
import com.springboot.Project.ZomatoApp.entities.Restaurant;
import com.springboot.Project.ZomatoApp.entities.User;
import com.springboot.Project.ZomatoApp.entities.enums.PaymentMethod;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {
    private Long id;

    private User customer;

    private Restaurant restaurant;

//    private MenuItem items;

    private Double totalAmount;

    private String status;

    private LocalDateTime createdTime;

//    private PointDto deliveryLocation;

    private List<OrderItems> items;

    private PaymentMethod paymentMethod;

    private int totalPreparationTime;
//    private String otp;

}
