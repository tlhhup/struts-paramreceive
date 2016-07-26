package com.paramreceive.action;

import com.opensymphony.xwork2.ActionSupport;
import com.paramreceive.entity.User;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/*
	 * // 1、通过普通属性接受数据--->属性名和参数名一致 private String userName; private String pwd;
	 * 
	 * // 2、该属性的set方法不能少 public void setUserName(String userName) {
	 * this.userName = userName; }
	 * 
	 * public void setPassword(String password) { this.pwd = password; }
	 */
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login() {
		System.out.println(user);
		return "main";
	}

}
