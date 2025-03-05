package com.project.expense.service;

import java.time.LocalDate;
import java.util.List;

import com.project.expense.dto.ExpenseDTO;
import com.project.expense.entity.Expense;

public interface ExpenseService {
	public abstract Expense addExpense(ExpenseDTO expenseDTO);

	public abstract Expense updateExpense(Long id, ExpenseDTO expenseDTO);

	public abstract String deleteExpense(Long userId, Long id);

	public abstract Expense getExpense(Long userId, Long id);

	public abstract List<Expense> getAllExpenses(Long userId);
	
	public abstract Double getTotalExpenses(Long userId);

	public abstract List<Expense> getExpenseByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);
    
	public void deleteExpensesByUserId(Long userId);

}
