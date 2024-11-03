package com.order_management_service.Order.Management.Service;

import com.order_management_service.Order.Management.Service.DTO.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
@EnableFeignClients
public class OrderManagementServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderManagementServiceApplication.class, args);
	}
}






//@FeignClient(name = "PRODUCT-CATALOG-SERVICE")
//public interface ProductClient {
//	@GetMapping("/{id}")
//	Product findById(@PathVariable("id") Long id);
//
//	@PutMapping("/{id}")
//	ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product);
//}



