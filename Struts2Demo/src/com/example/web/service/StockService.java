package com.example.web.service;

import java.util.List;

import com.example.web.dto.StockDTO;

public interface StockService {
	public void saveStockData(String stockCode,String stockName);
	public void saveStockDataWithDetails(String stockCode,String stockName, String company,String description);
	public List<StockDTO> loadAllStockData();
	
}
