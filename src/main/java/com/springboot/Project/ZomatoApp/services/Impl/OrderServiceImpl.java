package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.dto.OrderRequestDto;
import com.springboot.Project.ZomatoApp.entities.Customer;
import com.springboot.Project.ZomatoApp.entities.DeliveryPartner;
import com.springboot.Project.ZomatoApp.entities.Order;
import com.springboot.Project.ZomatoApp.entities.OrderRequest;
import com.springboot.Project.ZomatoApp.entities.enums.OrderStatus;
import com.springboot.Project.ZomatoApp.services.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order getAllOrder() {
        return null;
    }

    @Override
    public void matchWithDeliveryPartner(OrderRequestDto orderRequestDto) {

    }

    @Override
    public Order createNewOrder(OrderRequest orderRequest, DeliveryPartner deliveryPartner) {
        return null;
    }

    @Override
    public Order updateOrderStatus(Order order, OrderStatus orderStatus) {
        return null;
    }

    @Override
    public Page<Order> getAllOrderOfCustomer(Customer customer, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Order> getAllOrderOfDeliveryPartner(DeliveryPartner deliveryPartner, PageRequest pageRequest) {
        return null;
    }
}
