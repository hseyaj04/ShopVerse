package com.product_catalog.product_catalog_service.repository;

import com.product_catalog.product_catalog_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
