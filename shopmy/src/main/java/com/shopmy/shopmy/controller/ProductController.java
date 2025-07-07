package com.shopmy.shopmy.controller;

import com.shopmy.shopmy.model.Product;
import com.shopmy.shopmy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

    @GetMapping("/product/{productID}")
    public Product getProductByID(@PathVariable int productID){
        return service.getProductByID(productID);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
         service.addProduct(product);
    }
}
