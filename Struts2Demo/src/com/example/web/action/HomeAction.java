package com.example.web.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.web.dto.StockDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
	
	private boolean adminUser;
	private String userName;
	private Map<String,String> dataMap;
	private List<StockDTO> stockDTOList;
	
	public String execute(){
		
		System.out.println("here ..........execute...adminUser : "+adminUser+" and userName :"+userName);
		return SUCCESS;
	}
	
	public String testData(){		
		System.out.println("here ..........testData...adminUser : "+" and userName :"+userName);
		
		
		return "checkboolean";
	}

	
	public String testRadioTag(){		
		System.out.println("here ..........testData...adminUser : "+" and userName :"+userName);
		
		dataMap=new HashMap<>();
		dataMap.put("APPLE", "Apple");
		dataMap.put("ORANGE", "Orange");
		dataMap.put("BANANA", "Banana");
		setDataMap(dataMap);
		
		stockDTOList=new ArrayList<>();
		stockDTOList.add(new StockDTO(1,"AXIBAN"));
		stockDTOList.add(new StockDTO(2,"ICIBAN"));
		stockDTOList.add(new StockDTO(3,"STABAN"));
		setStockDTOList(stockDTOList);
		
		return "testTag";
	}

	public boolean isAdminUser() {
		return adminUser;
	}

	public void setAdminUser(boolean adminUser) {
		this.adminUser = adminUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String,String> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String,String> dataMap) {
		this.dataMap = dataMap;
	}

	public List<StockDTO> getStockDTOList() {
		return stockDTOList;
	}

	public void setStockDTOList(List<StockDTO> stockDTOList) {
		this.stockDTOList = stockDTOList;
	}

}
