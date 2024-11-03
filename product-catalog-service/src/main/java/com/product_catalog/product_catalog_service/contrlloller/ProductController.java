package com.product_catalog.product_catalog_service.contrlloller;


import com.product_catalog.product_catalog_service.entity.Product;
import com.product_catalog.product_catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product p) {
        // No need to check for ID; it will be auto-generated
        Product createdProduct = productService.saveProduct(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct); // Return created product with 201 status
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product){
        return new ResponseEntity<>(productService.updateById(id, product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return productService.deleteById(id);
    }

}
