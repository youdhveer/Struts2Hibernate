package com.example.web.dao;

import java.util.List;

import com.example.web.model.Stock;
import com.example.web.model.StockDetail;

public interface StockDAO {
	public void saveStock(Stock stock);
	public void saveStockDetails(StockDetail stockDetails);
	public Stock loadStock(String stockId);
	public List<Stock> loadAllStock();
}
