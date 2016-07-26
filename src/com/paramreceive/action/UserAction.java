package com.paramreceive.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.paramreceive.entity.User;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	
	private User user;

	@Override
	public User getModel() {
		user=new User();
		return user;
	}
	
	public String login(){
		System.out.println(user);
		return "main";
	}

}
