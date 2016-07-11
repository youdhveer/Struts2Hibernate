package com.example.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.web.dto.StockDTO;
import com.example.web.model.Stock;
import com.example.web.model.StockDetail;
import com.example.web.service.StockService;
import com.example.web.service.StockServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StockAction extends ActionSupport{

	private String stockCode;
	private String stockName;
	private String company;
	private String description;
	
	private List<StockDTO> stockList;
	
	public String execute(){
		System.out.println("Stock action executes....");
		StockService stockService=new StockServiceImpl();
		stockService.saveStockDataWithDetails(stockCode, stockName, company, description);
		stockList=stockService.loadAllStockData();		
		return SUCCESS;
	}
	
	public String loadStock(){
		System.out.println("viewStock action executes....");
		StockService stockService=new StockServiceImpl();
		stockService.saveStockDataWithDetails(stockCode, stockName, company, description);
		stockList=stockService.loadAllStockData();	
		return "stockList";
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<StockDTO> getStockList() {
		return stockList;
	}

	public void setStockList(List<StockDTO> stockList) {
		this.stockList = stockList;
	}
	
	
}
