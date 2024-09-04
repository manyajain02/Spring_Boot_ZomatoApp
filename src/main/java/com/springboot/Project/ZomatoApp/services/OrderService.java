package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.dto.OrderRequestDto;
import com.springboot.Project.ZomatoApp.entities.Customer;
import com.springboot.Project.ZomatoApp.entities.DeliveryPartner;
import com.springboot.Project.ZomatoApp.entities.Order;
import com.springboot.Project.ZomatoApp.entities.OrderRequest;
import com.springboot.Project.ZomatoApp.entities.enums.OrderStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface OrderService {

    Order getAllOrder();

    void matchWithDeliveryPartner(OrderRequestDto orderRequestDto);

    Order createNewOrder(OrderRequest orderRequest, DeliveryPartner deliveryPartner);

    Order updateOrderStatus(Order order, OrderStatus orderStatus);

   Page<Order> getAllOrderOfCustomer(Customer customer, PageRequest pageRequest);

   Page<Order> getAllOrderOfDeliveryPartner(DeliveryPartner deliveryPartner, PageRequest pageRequest);
}
