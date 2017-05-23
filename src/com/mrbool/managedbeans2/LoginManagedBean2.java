package com.mrbool.managedbeans2;

import javax.faces.application.FacesMessage;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.mrbool.db2.UserDAO2;
import com.mrbool.model2.User4;

@ManagedBean(name = "LoginMB2", eager = true)
@RequestScoped
public class LoginManagedBean2 {
	
	private UserDAO2 userDAO = new UserDAO2();
	private User4 user = new User4();
	
	
	public String checkValidUser() {
		user = userDAO.getUser(user.getNameUser(), user.getPassword()); 
		
		if (user == null) {
			user = new User4(); 
			FacesContext.getCurrentInstance().addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "User not found!", " Login Error!"));
			return null; 
		} else { 
			return "success"; 
		}					
	}
	
	
	public User4 getUser(){
		return user;
	}
	
	public void setUser(User4 user){
		this.user = user;
	}
	
}
