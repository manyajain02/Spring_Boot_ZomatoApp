package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.RestaurantDto;
import com.springboot.Project.ZomatoApp.entities.Order;
import com.springboot.Project.ZomatoApp.services.RatingService;

public class RatingServiceImpl implements RatingService {
    @Override
    public DeliveryPartnerDto rateDriver(Order order, Integer rating) {
        return null;
    }

    @Override
    public CustomerDto rateCustomer(Order order, Integer rating) {
        return null;
    }

    @Override
    public RestaurantDto rateRestaurant(Order order, Integer rating) {
        return null;
    }

    @Override
    public void createNewRating(Order order) {

    }
}
