package com.springboot.Project.ZomatoApp.services;

import com.springboot.Project.ZomatoApp.dto.*;
import com.springboot.Project.ZomatoApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RestaurantService {

//    getItems
//    addItems
//            updateItems
//            deleteImems
//    getCancellations()
    Page<OrderDto> getAllMyOrder(PageRequest pageRequest);

    OrderRequestDto requestOrder(OrderRequestService orderRequestService);

    OrderDto cancelOrder(Long orderId);

    CustomerDto getMyProfile();

    RestaurantDto createNewRestaurant(User user);

    RestaurantDto updateRestaurant(User user);

    RestaurantDto deleteRestaurant(User user);

    RestaurantDto getCurrentCustomer();
}






//DeliveryPartnerDto rateDeliveryPartner(Long orderId , Integer rating);






