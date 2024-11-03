package com.order_management_service.Order.Management.Service.DTO;


import lombok.Data;

@Data
public class Product {
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Integer quantity;
}
