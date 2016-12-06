package com.example.web.action;

import com.example.web.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<LoginDTO>{

	private String username;
	private String password;
	 
    LoginDTO loginDTO=new LoginDTO();
    
	//business logic
	public String execute() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return "success";

	}

	//simple validation
	public void validate(){
		//String user="";
		if(loginDTO !=null){
			if("youdhveer".equals(loginDTO.getUserName())){
				addActionMessage("You are valid user!");
			}else{
				addActionError("I don't know you, dont try to hack me!");
			}
		}else{
			addActionError("Login DTO failed to get passed user information!");
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


	public LoginDTO getModel() {
		
		return loginDTO;
	}

	
	
	
}