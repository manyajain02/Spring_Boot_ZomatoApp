package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.RestaurantDto;
import com.springboot.Project.ZomatoApp.entities.Order;

public interface RatingService {

    DeliveryPartnerDto rateDriver(Order order, Integer rating);

    CustomerDto rateCustomer(Order order, Integer rating);

    RestaurantDto rateRestaurant(Order order, Integer rating);

    void createNewRating(Order order);
}
