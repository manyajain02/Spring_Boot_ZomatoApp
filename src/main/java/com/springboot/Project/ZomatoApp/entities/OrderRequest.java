package com.springboot.Project.ZomatoApp.entities;

import com.springboot.Project.ZomatoApp.entities.enums.OrderRequestStatus;
import com.springboot.Project.ZomatoApp.entities.enums.PaymentMethod;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderRequest {

    private Long id;

    private User user;

    private Order order;

    private Customer customer;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private OrderRequestStatus orderRequestStatus;

}
