package com.example.web.dto;

public class StockDTO {
	
	private Integer stockId;
	private String  stockCode;
	private String  stockName;
	private String  companyName;
	
	public StockDTO(){}
	public StockDTO(int stockId, String stockCode){
		this.stockId=stockId;
		this.stockCode=stockCode;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StockDTO [stockId=").append(stockId)
				.append(", stockCode=").append(stockCode)
				.append(", stockName=").append(stockName)
				.append(", companyName=").append(companyName).append("]");
		return builder.toString();
	}
	
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}
