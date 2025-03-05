package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "EXPENSEMICROSERVICE")
public interface ExpenseClient {
	@DeleteMapping("expense/deleteAll/{userId}")
	public String deleteAllExpenses(@PathVariable Long userId);
}