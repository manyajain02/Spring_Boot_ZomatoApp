package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.OrderDto;
import com.springboot.Project.ZomatoApp.entities.DeliveryPartner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DeliveryPartnerService {

    OrderDto acceptOrder(Long orderId);

    OrderDto cancelOrder(Long orderId);

    OrderDto startOrder(Long orderId);

    OrderDto endOrder(Long orderId);

    CustomerDto rateCustomer(Long orderId, Integer rating);

    DeliveryPartnerDto getMyProfile();

    Page<OrderDto> getAllMyOrders(PageRequest pageRequest);

   DeliveryPartner getCurrentDeliveryPartner();

   DeliveryPartner updateDeliveryPartnerAvailability(DeliveryPartner deliveryPartner, boolean availability);

   DeliveryPartner createNewDeliveryPartner(DeliveryPartner deliveryPartner);
}
