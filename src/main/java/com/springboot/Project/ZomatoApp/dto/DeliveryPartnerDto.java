package com.springboot.Project.ZomatoApp.dto;

import com.springboot.Project.ZomatoApp.entities.User;
import lombok.Data;

@Data
public class DeliveryPartnerDto {

    private Long id;

    private User user;

    private Boolean available;

    private Double rating;

    private String vehicleId;

}