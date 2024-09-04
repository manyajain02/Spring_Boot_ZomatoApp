package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.OrderDto;
import com.springboot.Project.ZomatoApp.entities.DeliveryPartner;
import com.springboot.Project.ZomatoApp.services.DeliveryPartnerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class DeliveryPartnerServiceImpl implements DeliveryPartnerService {
    @Override
    public OrderDto acceptOrder(Long orderId) {
        return null;
    }

    @Override
    public OrderDto cancelOrder(Long orderId) {
        return null;
    }

    @Override
    public OrderDto startOrder(Long orderId) {
        return null;
    }

    @Override
    public OrderDto endOrder(Long orderId) {
        return null;
    }

    @Override
    public CustomerDto rateCustomer(Long orderId, Integer rating) {
        return null;
    }

    @Override
    public DeliveryPartnerDto getMyProfile() {
        return null;
    }

    @Override
    public Page<OrderDto> getAllMyOrders(PageRequest pageRequest) {
        return null;
    }

    @Override
    public DeliveryPartner getCurrentDeliveryPartner() {
        return null;
    }

    @Override
    public DeliveryPartner updateDeliveryPartnerAvailability(DeliveryPartner deliveryPartner, boolean availability) {
        return null;
    }

    @Override
    public DeliveryPartner createNewDeliveryPartner(DeliveryPartner deliveryPartner) {
        return null;
    }
}
