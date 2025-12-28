package com.rasaluxe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.rasaluxe.dtos.OrderRequestDto;
import com.rasaluxe.dtos.OrderResponseDto;
import com.rasaluxe.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin/orders")
public class OrderAdminController {

    private final OrderService orderService;

    public OrderAdminController(OrderService orderService) {
        this.orderService = orderService;
    }

    // ✅ CREATE ORDER
    @PostMapping
    public OrderResponseDto createOrder(
            @Valid @RequestBody OrderRequestDto request) {
        return orderService.createOrder(request);
    }

    // ✅ UPDATE ORDER (FULL UPDATE)
    @PutMapping("/{orderId}")
    public OrderResponseDto updateOrder(
            @PathVariable Integer orderId,
            @Valid @RequestBody OrderRequestDto request) {
        return orderService.updateOrder(orderId, request);
    }

    // ✅ UPDATE ORDER STATUS
    @PatchMapping("/{orderId}/status")
    public OrderResponseDto updateOrderStatus(
            @PathVariable Integer orderId,
            @RequestParam String status) {
        return orderService.updateOrderStatus(orderId, status);
    }

    // ✅ UPDATE PAYMENT STATUS
    @PatchMapping("/{orderId}/payment-status")
    public OrderResponseDto updatePaymentStatus(
            @PathVariable Integer orderId,
            @RequestParam String paymentStatus) {
        return orderService.updatePaymentStatus(orderId, paymentStatus);
    }

    // ✅ GET ALL ORDERS
    @GetMapping
    public List<OrderResponseDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    // ✅ GET ORDER BY ID
    @GetMapping("/{orderId}")
    public OrderResponseDto getOrderById(
            @PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }

    // ✅ DELETE ORDER
    @DeleteMapping("/{orderId}")
    public void deleteOrder(
            @PathVariable Integer orderId) {
        orderService.deleteOrder(orderId);
    }
}
