package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.OrderDto;
import com.springboot.Project.ZomatoApp.dto.OrderRequestDto;
import com.springboot.Project.ZomatoApp.entities.Customer;
import com.springboot.Project.ZomatoApp.entities.Order;
import com.springboot.Project.ZomatoApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    OrderRequestDto requestOrder(OrderRequestDto orderRequestDto);

    Page<OrderDto> getAllMyOrder(PageRequest pageRequest);

    OrderDto cancelOrder(Long orderId);

    DeliveryPartnerDto rateDeliveryPartner(Long orderId , Integer rating);

    CustomerDto getMyProfile();

    CustomerDto createNewOrder(User user);

    CustomerDto getCurrentCustomer();
}

