package com.springboot.Project.ZomatoApp.dto;

import com.springboot.Project.ZomatoApp.entities.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class CustomerDto {

    private Long id;

    private User user;

    private Double rating;

}
