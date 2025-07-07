package com.shopmy.shopmy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int productID;
    private String productName;
    private int price;
}
