package com.springboot.Project.ZomatoApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.Project.ZomatoApp.entities.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User customer;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

//    private MenuItem items;

    private Double totalAmount;

    private String status;

    private LocalDateTime createdTime; //

    @ManyToOne                         /// many order can have same address.
    private Address deliveryAddress;

//    private PointDto deliveryLocation; // deliveryAddress


    private List<OrderItems> items;

    private PaymentMethod paymentMethod;

    private int totalPreparationTime;

    private int totalItem;
    private int totalPrice;
    //    private String otp;

//    Methods: calculateTotal(), updateStatus())
}
