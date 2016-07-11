package com.example.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.web.dao.StockDAO;
import com.example.web.dao.StockDAOImpl;
import com.example.web.dto.StockDTO;
import com.example.web.model.Stock;
import com.example.web.model.StockDetail;

public class StockServiceImpl implements StockService{

	
	public void saveStockData(String stockCode, String stockName) {
		// TODO Auto-generated method stub
		
	}

	
	public void saveStockDataWithDetails(String stockCode, String stockName,
			String company, String description) {
			try{
				StockDAO stockDAO=new StockDAOImpl();
			    Stock stock = new Stock();
		        
		        stock.setStockCode(stockCode);
		        stock.setStockName(stockName);
		     
		        StockDetail stockDetail = new StockDetail();
		        stockDetail.setCompName(company);
		        stockDetail.setCompDesc(description);
		        stockDetail.setListedDate(new Date());
		        
		        stock.setStockDetail(stockDetail);
		        stockDetail.setStock(stock);
		        
		        stockDAO.saveStock(stock);
			}catch(Exception e){
				System.out.println("Exception : "+e.getMessage());
				e.printStackTrace();
			}
			
		
	}
	
	public List<StockDTO> loadAllStockData(){
		List<StockDTO> stockList=new ArrayList<StockDTO>();
		try{
			StockDAO stockDAO=new StockDAOImpl();
			List<Stock> resultList=stockDAO.loadAllStock();
			for(Stock stock:resultList){
				StockDTO stockDTO=new StockDTO();
				stockDTO.setStockCode(stock.getStockCode());
				stockDTO.setStockId(stock.getStockId());
				stockDTO.setStockName(stock.getStockName());
				StockDetail stockdetails=stock.getStockDetail();
				if(stockdetails !=null){
					stockDTO.setCompanyName(stockdetails.getCompName());					
				}
				stockList.add(stockDTO);
			}
			System.out.println("stockList :: "+stockList.size());
		}catch(Exception e){
			e.printStackTrace();			
		}
		return stockList;
	}

}
