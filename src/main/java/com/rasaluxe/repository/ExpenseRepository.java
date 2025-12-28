package com.rasaluxe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rasaluxe.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
