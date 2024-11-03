package com.order_management_service.Order.Management.Service.externalService;


import com.order_management_service.Order.Management.Service.DTO.Product;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "PRODUCT-CATALOG-SERVICE")
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Product findById(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product);
}
