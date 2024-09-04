package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.RestaurantDto;
import com.springboot.Project.ZomatoApp.entities.User;
import com.springboot.Project.ZomatoApp.services.AuthService;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(User user) {
        return "";
    }

    @Override
    public String signUp(String username, String password) {
        return "";
    }

    @Override
    public DeliveryPartnerDto onboardNewDeliveryPartner(User user) {
        return null;
    }

    @Override
    public RestaurantDto onboardNewRestaurant(User user) {
        return null;
    }

    @Override
    public String refreshToken(String refreshToken) {
        return "";
    }
}
