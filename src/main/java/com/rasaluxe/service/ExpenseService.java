package com.rasaluxe.service;

import java.util.List;

import com.rasaluxe.dtos.ExpenseRequestDto;
import com.rasaluxe.dtos.ExpenseResponseDto;

public interface ExpenseService {

	ExpenseResponseDto createExpense(ExpenseRequestDto request);

	ExpenseResponseDto updateExpense(Integer expenseId, ExpenseRequestDto request);

	ExpenseResponseDto getExpenseById(Integer expenseId);

	List<ExpenseResponseDto> getAllExpenses();

	void deleteExpense(Integer expenseId);
}
