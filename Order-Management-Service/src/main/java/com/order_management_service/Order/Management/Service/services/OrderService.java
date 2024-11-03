package com.order_management_service.Order.Management.Service.services;


import com.order_management_service.Order.Management.Service.DTO.OrderEntity;
import com.order_management_service.Order.Management.Service.DTO.Product;
import com.order_management_service.Order.Management.Service.OrderManagementServiceApplication;
import com.order_management_service.Order.Management.Service.externalService.ProductClient;
import com.order_management_service.Order.Management.Service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductClient productClient;

//    public Boolean createOrder(OrderEntity order){
//        Product p = productClient.findById(order.getProductId());
//        Double totalPrice = order.getQuantity() * p.getPrice();
//        order.setTotalPrice(totalPrice);
//
//        p.setQuantity(p.getQuantity() - order.getQuantity());
//        productClient.updateProduct(order.getProductId(), p);
//        order.setOrderStatus(true);
//        order.setOrderDate(new Date());
//
//        orderRepository.save(order);
//        return true;
//    }

    public List<OrderEntity> getAllOrder(){
        return orderRepository.findAll();
    }
}
