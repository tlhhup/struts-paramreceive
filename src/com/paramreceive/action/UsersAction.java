package com.paramreceive.action;

import com.paramreceive.entity.User;

public class UsersAction extends BaseAction<User> {

	private static final long serialVersionUID = 1L;

	public String login(){
		System.out.println(model);
		return "main";
	}
	
	public String logout(){
		System.out.println("用户退出");
		return "logout";
	}
	
	/*
	@Override
	public void validate() {//全局方法校验
		System.out.println("validate");
		//校验失败--->产生了错误
		if(!"admin".equals(model.getUserName())||!"admin".equals(model.getPassword())){
			this.addActionError("用户名或密码错误");//跳转input视图
		}
	}
	*/
	
	//指定的方法进行校验
	public void validateLogin() {
		System.out.println("validateLogin");
		//校验失败--->产生了错误
		if(!"admin".equals(model.getUserName())||!"admin".equals(model.getPassword())){
			this.addActionError("用户名或密码错误");//跳转input视图
		}
	}
	
}
