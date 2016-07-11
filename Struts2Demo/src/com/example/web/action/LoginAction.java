package com.example.web.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	 
	//business logic
	public String execute() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return "success";

	}

	//simple validation
	public void validate(){
		if("youdhveer".equals(getUsername())){
			addActionMessage("You are valid user!");
		}else{
			addActionError("I don't know you, dont try to hack me!");
		}
		
	}
		
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	
}