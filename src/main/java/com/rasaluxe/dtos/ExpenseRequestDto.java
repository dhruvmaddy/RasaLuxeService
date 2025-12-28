package com.rasaluxe.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.rasaluxe.enums.ExpenseTypeEnum;
import com.rasaluxe.enums.VendorPlatformEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ExpenseRequestDto {

	@NotBlank
	private VendorPlatformEnum platformName;

	@NotBlank
	private String productName;

	@NotBlank
	private ExpenseTypeEnum expenseType;

	@NotNull
	@Positive
	private BigDecimal expenseAmount;

	@NotNull
	private LocalDate expenseDate;

	private String expenseNotes;

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
