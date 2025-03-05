package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STATISTICSMICROSERVICE")
public interface StatisticsClient {

    @DeleteMapping("statistics/deleteAll/{userId}")
    public String deleteStatsByUserId(@PathVariable Long userId);
}