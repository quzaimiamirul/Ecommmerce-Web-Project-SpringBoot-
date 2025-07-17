package com.shopmy.shopmy.service;


import com.shopmy.shopmy.model.Product;
import com.shopmy.shopmy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Laptop", 500),
//            new Product(102,"Phone", 200)));

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product getProductByID(int productID){
        return productRepo.findById(productID).orElse(new Product());
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int productID) {
        productRepo.deleteById(productID);
    }
}
