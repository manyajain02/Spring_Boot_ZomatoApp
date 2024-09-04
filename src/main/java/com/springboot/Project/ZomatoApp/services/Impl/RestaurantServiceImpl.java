package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.OrderDto;
import com.springboot.Project.ZomatoApp.dto.OrderRequestDto;
import com.springboot.Project.ZomatoApp.dto.RestaurantDto;
import com.springboot.Project.ZomatoApp.entities.User;
import com.springboot.Project.ZomatoApp.services.OrderRequestService;
import com.springboot.Project.ZomatoApp.services.RestaurantService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public Page<OrderDto> getAllMyOrder(PageRequest pageRequest) {
        return null;
    }

    @Override
    public OrderRequestDto requestOrder(OrderRequestService orderRequestService) {
        return null;
    }

    @Override
    public OrderDto cancelOrder(Long orderId) {
        return null;
    }

    @Override
    public CustomerDto getMyProfile() {
        return null;
    }

    @Override
    public RestaurantDto createNewRestaurant(User user) {
        return null;
    }

    @Override
    public RestaurantDto updateRestaurant(User user) {
        return null;
    }

    @Override
    public RestaurantDto deleteRestaurant(User user) {
        return null;
    }

    @Override
    public RestaurantDto getCurrentCustomer() {
        return null;
    }
}
