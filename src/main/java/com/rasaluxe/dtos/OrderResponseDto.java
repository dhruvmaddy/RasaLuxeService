package com.rasaluxe.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.rasaluxe.enums.OrderStatusEnum;
import com.rasaluxe.enums.PaymentModeEnum;
import com.rasaluxe.enums.PaymentStatusEnum;

public class OrderResponseDto {

    private Integer orderId;
    private String orderNumber;
    private Integer customerId;
    private OrderStatusEnum orderStatus;
    private PaymentStatusEnum paymentStatus;
    private PaymentModeEnum paymentMode;
    private BigDecimal totalAmount;
    private LocalDateTime orderDate;
    private String shippingAddress;
    private String notes;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public OrderStatusEnum getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatusEnum orderStatus) {
		this.orderStatus = orderStatus;
	}
	public PaymentStatusEnum getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public PaymentModeEnum getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentModeEnum paymentMode) {
		this.paymentMode = paymentMode;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

    
}

