package com.order_management_service.Order.Management.Service.repository;

import com.order_management_service.Order.Management.Service.DTO.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
