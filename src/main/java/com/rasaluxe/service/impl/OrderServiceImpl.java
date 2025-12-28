package com.rasaluxe.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rasaluxe.dtos.OrderRequestDto;
import com.rasaluxe.dtos.OrderResponseDto;
import com.rasaluxe.entity.Customer;
import com.rasaluxe.entity.Order;
import com.rasaluxe.enums.OrderStatusEnum;
import com.rasaluxe.enums.PaymentStatusEnum;
import com.rasaluxe.repository.CustomerRepository;
import com.rasaluxe.repository.OrderRepository;
import com.rasaluxe.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    private final com.rasaluxe.repository.OrderRepository orderRepository;
    private final com.rasaluxe.repository.CustomerRepository customerRepository;

    public OrderServiceImpl(
            OrderRepository orderRepository,
            CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public OrderResponseDto createOrder(OrderRequestDto request) {

        Customer customer = customerRepository.findById(request.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Order order = new Order();
        order.setCustomer(customer);
        order.setOrderNumber(generateOrderNumber());
        order.setOrderStatus(request.getOrderStatus());
        order.setPaymentStatus(request.getPaymentStatus());
        order.setPaymentMode(request.getPaymentMode());
        order.setTotalAmount(request.getTotalAmount());
        order.setShippingAddress(request.getShippingAddress());
        order.setNotes(request.getNotes());
        order.setOrderDate(LocalDateTime.now());

        Order saved = orderRepository.save(order);
        return mapToResponse(saved);
    }

    @Override
    public OrderResponseDto updateOrder(Integer orderId, OrderRequestDto request) {

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.setOrderStatus(request.getOrderStatus());
        order.setPaymentStatus(request.getPaymentStatus());
        order.setPaymentMode(request.getPaymentMode());
        order.setTotalAmount(request.getTotalAmount());
        order.setShippingAddress(request.getShippingAddress());
        order.setNotes(request.getNotes());

        Order updated = orderRepository.save(order);
        return mapToResponse(updated);
    }

    @Override
    public OrderResponseDto updateOrderStatus(Integer orderId, String status) {

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.setOrderStatus(OrderStatusEnum.valueOf(status));
        return mapToResponse(orderRepository.save(order));
    }

    @Override
    public OrderResponseDto updatePaymentStatus(Integer orderId, String paymentStatus) {

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        order.setPaymentStatus(PaymentStatusEnum.valueOf(paymentStatus));
        return mapToResponse(orderRepository.save(order));
    }

    @Override
    public OrderResponseDto getOrderById(Integer orderId) {

        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        return mapToResponse(order);
    }

    @Override
    public List<OrderResponseDto> getAllOrders() {

        return orderRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteOrder(Integer orderId) {

        if (!orderRepository.existsById(orderId)) {
            throw new RuntimeException("Order not found");
        }

        orderRepository.deleteById(orderId);
    }

    // 🔁 HELPERS

    private OrderResponseDto mapToResponse(Order order) {

        OrderResponseDto dto = new OrderResponseDto();
        dto.setOrderId(order.getOrderId());
        dto.setOrderNumber(order.getOrderNumber());
        dto.setCustomerId(order.getCustomer().getCustomerId());
        dto.setOrderStatus(order.getOrderStatus());
        dto.setPaymentStatus(order.getPaymentStatus());
        dto.setPaymentMode(order.getPaymentMode());
        dto.setTotalAmount(order.getTotalAmount());
        dto.setOrderDate(order.getOrderDate());
        dto.setShippingAddress(order.getShippingAddress());
        dto.setNotes(order.getNotes());

        return dto;
    }

    private String generateOrderNumber() {
        return "RL-ORD-" + System.currentTimeMillis();
    }

}
