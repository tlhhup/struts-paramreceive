package com.paramreceive.action;

import com.opensymphony.xwork2.ActionSupport;
import com.paramreceive.entity.User;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/*
	 * // 1��ͨ����ͨ���Խ�������--->�������Ͳ�����һ�� private String userName; private String pwd;
	 * 
	 * // 2�������Ե�set���������� public void setUserName(String userName) {
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
