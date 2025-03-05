package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.client.ExpenseClient;
import com.client.IncomeClient;
import com.client.StatisticsClient;
import com.entity.UserInfo;
import com.repository.UserInfoRepository;

@Service
public class UserService {
	@Autowired
	private UserInfoRepository repository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
    private IncomeClient incomeClient;
	@Autowired
    private ExpenseClient expenseClient;
	
	@Autowired
    private StatisticsClient statsClient;

	public String addUser(UserInfo userInfo) {
		String name = userInfo.getName();
		UserInfo obj1 = repository.findByName(name).orElse(null);
		System.out.println(obj1);
		if (obj1 == null) {
			userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
			repository.save(userInfo);
			return "Registration Successfully";
		} else {
			return "This User is Already Registered.";
		}
	}
	 public String deleteUser(Long userId) {
	        UserInfo user = repository.findByUserId(userId).orElse(null);
	        if (user != null) {
	            // Delete related data in other services
	            incomeClient.deleteAllIncomes(userId);
	            expenseClient.deleteAllExpenses(userId);
	            statsClient.deleteStatsByUserId(userId);

	            repository.delete(user);
	            return "User Deleted Successfully";
	        } else {
	            return "User Not Found";
	        }
	 }
}

