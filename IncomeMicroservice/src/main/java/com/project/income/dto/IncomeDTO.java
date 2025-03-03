package com.project.income.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Data
public class IncomeDTO {
	@NotBlank(message = "Title is mandatory")
	private String title;

	private String description;

	@NotBlank(message = "Category is mandatory")
	private String category;

	@NotNull(message = "Amount is mandatory")
	@Positive(message = "Amount must be a positive number")
	private Double amount;

	@NotNull(message = "Date is mandatory")
	private LocalDate date;

	@NotNull(message = "User ID is mandatory")
	private Long userId;
}
