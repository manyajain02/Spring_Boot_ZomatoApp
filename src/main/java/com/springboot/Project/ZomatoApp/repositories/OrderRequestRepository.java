package com.springboot.Project.ZomatoApp.repositories;

import com.springboot.Project.ZomatoApp.entities.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRequestRepository extends JpaRepository<OrderRequest,Long> {
}