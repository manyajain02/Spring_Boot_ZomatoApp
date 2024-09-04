package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.RestaurantDto;
import com.springboot.Project.ZomatoApp.entities.User;

public interface AuthService {

    String login(User user);

    String signUp(String username, String password);

    DeliveryPartnerDto onboardNewDeliveryPartner(User user);

    RestaurantDto onboardNewRestaurant(User user);

    String refreshToken(String refreshToken);

}
