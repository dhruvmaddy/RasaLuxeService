package com.rasaluxe.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.rasaluxe.enums.ExpenseTypeEnum;
import com.rasaluxe.enums.VendorPlatformEnum;

public class ExpenseResponseDto {

	private Integer expenseId;
	private VendorPlatformEnum platformName;
	private String productName;
	private ExpenseTypeEnum expenseType;
	private BigDecimal expenseAmount;
	private LocalDate expenseDate;
	private String expenseNotes;

	public Integer getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Integer expenseId) {
		this.expenseId = expenseId;
	}

	public VendorPlatformEnum getPlatformName() {
		return platformName;
	}

	public void setPlatformName(VendorPlatformEnum platformName) {
		this.platformName = platformName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ExpenseTypeEnum getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseTypeEnum expenseType) {
		this.expenseType = expenseType;
	}

	public BigDecimal getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(BigDecimal expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	public String getExpenseNotes() {
		return expenseNotes;
	}

	public void setExpenseNotes(String expenseNotes) {
		this.expenseNotes = expenseNotes;
	}

}
