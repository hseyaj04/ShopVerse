package com.order_management_service.Order.Management.Service.controller;

import com.netflix.discovery.converters.Auto;
import com.order_management_service.Order.Management.Service.DTO.OrderEntity;
import com.order_management_service.Order.Management.Service.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<OrderEntity> getAll(){
        return orderService.getAllOrder();
    }

//    @PostMapping
//    public Boolean addOrder(@RequestBody OrderEntity order){
//        return orderService.createOrder(order);
//    }
}
