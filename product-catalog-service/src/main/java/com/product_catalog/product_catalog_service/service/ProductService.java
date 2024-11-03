package com.product_catalog.product_catalog_service.service;


import com.product_catalog.product_catalog_service.entity.Product;
import com.product_catalog.product_catalog_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null); // Returns null if not found
    }


    public ResponseEntity<Boolean> deleteById(Long id){
        if(productRepository.findById(id).isPresent()){
            productRepository.deleteById(id);
            return new ResponseEntity<>(true, HttpStatus.OK);
        }

        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }

    public Product updateById(Long id, Product product) {
        if (!productRepository.existsById(id)) {
            return null;
        }
        Product curr = productRepository.getReferenceById(id);
        curr.setName(product.getName().isEmpty() ? curr.getName() : product.getName());
        curr.setDescription((product.getDescription().isEmpty() ? curr.getDescription() : product.getDescription()));
        curr.setPrice(product.getPrice() == null ? curr.getPrice() : product.getPrice());
        curr.setQuantity(product.getQuantity() == null ? curr.getQuantity() : product.getQuantity());
        productRepository.save(curr);
        return product;
    }
}
