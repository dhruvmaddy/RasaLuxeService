package com.rasaluxe.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rasaluxe.dtos.ExpenseRequestDto;
import com.rasaluxe.dtos.ExpenseResponseDto;
import com.rasaluxe.service.ExpenseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin/expenses")
public class ExpenseAdminController {

    private final ExpenseService expenseService;

    public ExpenseAdminController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // ✅ CREATE
    @PostMapping
    public ExpenseResponseDto createExpense(
            @Valid @RequestBody ExpenseRequestDto request) {
        return expenseService.createExpense(request);
    }

    // ✅ UPDATE
    @PutMapping("/{expenseId}")
    public ExpenseResponseDto updateExpense(
            @PathVariable Integer expenseId,
            @Valid @RequestBody ExpenseRequestDto request) {
        return expenseService.updateExpense(expenseId, request);
    }

    // ✅ GET ALL
    @GetMapping
    public List<ExpenseResponseDto> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    // ✅ GET BY ID
    @GetMapping("/{expenseId}")
    public ExpenseResponseDto getExpenseById(
            @PathVariable Integer expenseId) {
        return expenseService.getExpenseById(expenseId);
    }

    // ✅ DELETE
    @DeleteMapping("/{expenseId}")
    public void deleteExpense(
            @PathVariable Integer expenseId) {
        expenseService.deleteExpense(expenseId);
    }
}


