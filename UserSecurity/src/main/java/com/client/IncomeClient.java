package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "INCOMEMICROSERVICE")
public interface IncomeClient {

   @DeleteMapping("income/deleteAll/{userId}")
   public String deleteAllIncomes(@PathVariable Long userId);
}