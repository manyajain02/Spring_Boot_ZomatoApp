package com.springboot.Project.ZomatoApp.services.Impl;

import com.springboot.Project.ZomatoApp.dto.CustomerDto;
import com.springboot.Project.ZomatoApp.dto.DeliveryPartnerDto;
import com.springboot.Project.ZomatoApp.dto.OrderDto;
import com.springboot.Project.ZomatoApp.dto.OrderRequestDto;
import com.springboot.Project.ZomatoApp.entities.Customer;
import com.springboot.Project.ZomatoApp.entities.OrderRequest;
import com.springboot.Project.ZomatoApp.entities.User;
import com.springboot.Project.ZomatoApp.entities.enums.OrderRequestStatus;
import com.springboot.Project.ZomatoApp.services.CustomerService;
import com.springboot.Project.ZomatoApp.services.OrderRequestService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final ModelMapper modelMapper;

    @Override
    public OrderRequestDto requestOrder(OrderRequestDto orderRequestDto) {
//        Customer customer = getCurrentCustomer();
        OrderRequest orderRequest = modelMapper.map(orderRequestDto, OrderRequest.class);
        orderRequest.setOrderRequestStatus(OrderRequestStatus.PENDING);
//        orderRequest.setCustomer();
//        Double price =
        return null;
    }

    @Override
    public Page<OrderDto> getAllMyOrder(PageRequest pageRequest) {
        return null;
    }

    @Override
    public OrderDto cancelOrder(Long orderId) {
        return null;
    }

    @Override
    public DeliveryPartnerDto rateDeliveryPartner(Long orderId, Integer rating) {
        return null;
    }

    @Override
    public CustomerDto getMyProfile() {
        return null;
    }


    @Override
    public CustomerDto createNewOrder(User user) {

        return null;
    }

    @Override
    public CustomerDto getCurrentCustomer() {
        return null;
    }
}
