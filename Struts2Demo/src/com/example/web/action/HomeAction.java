package com.example.web.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
	
	private boolean adminUser;
	private String userName;
	private Map<String,String> dataMap;
	
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

}
