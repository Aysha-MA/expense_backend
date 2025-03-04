package com.project.statistics.service;

import com.project.statistics.dto.GraphDTO;
import com.project.statistics.dto.StatsDTO;

public interface StatsService {
	public abstract GraphDTO getChartData(Long userId);

    public abstract String getDashboard();
    
	public abstract StatsDTO getStats(Long userId);
}
