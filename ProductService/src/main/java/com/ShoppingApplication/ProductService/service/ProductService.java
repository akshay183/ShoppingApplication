package com.ShoppingApplication.ProductService.service;

import com.ShoppingApplication.ProductService.model.ProductRequest;
import com.ShoppingApplication.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
