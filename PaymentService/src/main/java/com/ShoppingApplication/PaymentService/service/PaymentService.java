package com.ShoppingApplication.PaymentService.service;

import com.ShoppingApplication.PaymentService.model.PaymentRequest;
import com.ShoppingApplication.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
