package com.shopmy.shopmy.service;


import com.shopmy.shopmy.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Laptop", 500),
            new Product(102,"Phone", 200)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductByID(int productID){
        return products.stream()
                .filter(p -> p.getProductID() == productID)
                .findFirst().get();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i =0; i<products.size(); i++)
            if (products.get(i).getProductID() == product.getProductID())
                index = i;
        products.set(index, product);
    }

    public void deleteProduct(int productID) {
        int index = 0;
        for(int i =0; i<products.size(); i++)
            if (products.get(i).getProductID() == productID)
                index = i;
        products.remove(index);
    }
}
