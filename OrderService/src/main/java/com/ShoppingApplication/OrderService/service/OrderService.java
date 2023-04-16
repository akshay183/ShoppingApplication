package com.ShoppingApplication.OrderService.service;

import com.ShoppingApplication.OrderService.model.OrderRequest;
import com.ShoppingApplication.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
