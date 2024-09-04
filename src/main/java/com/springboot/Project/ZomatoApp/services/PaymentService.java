package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.entities.Order;
import com.springboot.Project.ZomatoApp.entities.Payment;
import com.springboot.Project.ZomatoApp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Order order);

    Payment createNewPayment(Order order);

    void updatePaymentStatus(Payment payment, PaymentStatus paymentStatus);
}
