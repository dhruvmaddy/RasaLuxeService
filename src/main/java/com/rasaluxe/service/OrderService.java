package com.rasaluxe.service;

import java.util.List;

import com.rasaluxe.dtos.OrderRequestDto;
import com.rasaluxe.dtos.OrderResponseDto;

public interface OrderService {

    OrderResponseDto createOrder(OrderRequestDto request);

    OrderResponseDto updateOrder(Integer orderId, OrderRequestDto request);

    OrderResponseDto updateOrderStatus(Integer orderId, String status);

    OrderResponseDto updatePaymentStatus(Integer orderId, String paymentStatus);

    OrderResponseDto getOrderById(Integer orderId);

    List<OrderResponseDto> getAllOrders();

    void deleteOrder(Integer orderId);
}
