package com.paramreceive.action;

import com.paramreceive.entity.User;

public class UsersAction extends BaseAction<User> {

	private static final long serialVersionUID = 1L;

	public String login(){
		System.out.println(model);
		return "main";
	}
	
	public String logout(){
		System.out.println("�û��˳�");
		return "logout";
	}
	
	/*
	@Override
	public void validate() {//ȫ�ַ���У��
		System.out.println("validate");
		//У��ʧ��--->�����˴���
		if(!"admin".equals(model.getUserName())||!"admin".equals(model.getPassword())){
			this.addActionError("�û������������");//��תinput��ͼ
		}
	}
	*/
	
	//ָ���ķ�������У��
	public void validateLogin() {
		System.out.println("validateLogin");
		//У��ʧ��--->�����˴���
		if(!"admin".equals(model.getUserName())||!"admin".equals(model.getPassword())){
			this.addActionError("�û������������");//��תinput��ͼ
		}
	}
	
}
