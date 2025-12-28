package com.rasaluxe.dtos;

import java.math.BigDecimal;

import com.rasaluxe.enums.OrderStatusEnum;
import com.rasaluxe.enums.PaymentModeEnum;
import com.rasaluxe.enums.PaymentStatusEnum;

import jakarta.validation.constraints.NotNull;

public class OrderRequestDto {

	@NotNull
	private Integer customerId;

	@NotNull
	private OrderStatusEnum orderStatus;

	@NotNull
	private PaymentStatusEnum paymentStatus;

	private PaymentModeEnum paymentMode;

	@NotNull
	private BigDecimal totalAmount;

	private String shippingAddress;

	private String notes;

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
