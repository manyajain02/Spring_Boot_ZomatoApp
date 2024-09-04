package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.entities.Order;
import com.springboot.Project.ZomatoApp.entities.Payment;
import com.springboot.Project.ZomatoApp.entities.enums.PaymentStatus;
import com.springboot.Project.ZomatoApp.services.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void processPayment(Order order) {

    }

    @Override
    public Payment createNewPayment(Order order) {
        return null;
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus paymentStatus) {

    }
}
