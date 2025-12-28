package com.rasaluxe.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rasaluxe.dtos.ExpenseRequestDto;
import com.rasaluxe.dtos.ExpenseResponseDto;
import com.rasaluxe.entity.Expense;
import com.rasaluxe.repository.ExpenseRepository;
import com.rasaluxe.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	private final ExpenseRepository expenseRepository;

	public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	@Override
	public ExpenseResponseDto createExpense(ExpenseRequestDto request) {

		Expense expense = new Expense();
		mapRequestToEntity(request, expense);

		Expense saved = expenseRepository.save(expense);
		return mapEntityToResponse(saved);
	}

	@Override
	public ExpenseResponseDto updateExpense(Integer expenseId, ExpenseRequestDto request) {

		Expense expense = expenseRepository.findById(expenseId)
				.orElseThrow(() -> new RuntimeException("Expense not found"));

		mapRequestToEntity(request, expense);

		Expense updated = expenseRepository.save(expense);
		return mapEntityToResponse(updated);
	}

	@Override
	public ExpenseResponseDto getExpenseById(Integer expenseId) {

		Expense expense = expenseRepository.findById(expenseId)
				.orElseThrow(() -> new RuntimeException("Expense not found"));

		return mapEntityToResponse(expense);
	}

	@Override
	public List<ExpenseResponseDto> getAllExpenses() {

		return expenseRepository.findAll().stream().map(this::mapEntityToResponse).collect(Collectors.toList());
	}

	@Override
	public void deleteExpense(Integer expenseId) {

		if (!expenseRepository.existsById(expenseId)) {
			throw new RuntimeException("Expense not found");
		}

		expenseRepository.deleteById(expenseId);
	}

	// 🔁 MAPPERS

	private void mapRequestToEntity(ExpenseRequestDto request, Expense expense) {
		expense.setPlatformName(request.getPlatformName());
		expense.setProductName(request.getProductName());
		expense.setExpenseType(request.getExpenseType());
		expense.setExpenseAmount(request.getExpenseAmount());
		expense.setExpenseDate(request.getExpenseDate());
		expense.setExpenseNotes(request.getExpenseNotes());
	}

	private ExpenseResponseDto mapEntityToResponse(Expense expense) {

		ExpenseResponseDto dto = new ExpenseResponseDto();
		dto.setExpenseId(expense.getExpenseId());
		dto.setPlatformName(expense.getPlatformName());
		dto.setProductName(expense.getProductName());
		dto.setExpenseType(expense.getExpenseType());
		dto.setExpenseAmount(expense.getExpenseAmount());
		dto.setExpenseDate(expense.getExpenseDate());
		dto.setExpenseNotes(expense.getExpenseNotes());

		return dto;
	}
}
