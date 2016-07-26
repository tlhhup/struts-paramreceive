package com.paramreceive.action;

import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.paramreceive.entity.User;

/**
 * ʹ��ͨ����ķ�ʽ
 */
public class UserActionWildcard extends BaseAction<User> implements ServletContextAware,RequestAware,SessionAware{

	private static final long serialVersionUID = 1L;
	private ServletContext sct;
	private Map<String, Object> session;
	private Map<String, Object> requst;

	public String login(){
		
		/*��һ��
//		ActionContext context = ActionContext.getContext();//request��Χ
//		context.put("req", "request��Χ������");
//		context.getApplication().put("app", "application��Χ������");
//		context.getSession().put("se", "session��Χ������");
//		
//		context.getSession().put("user", model);
		*/
		
		//application��
		/*�ڶ���
//		ServletContext servletContext = ServletActionContext.getServletContext();
//		servletContext.setAttribute("app", "servletContext��Χ������");
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("req", "request�е�����");
//		HttpSession session = request.getSession();
//		session.setAttribute("se", "session�е�����");
		*/
		sct.setAttribute("app", "servletContext��Χ������");
		session.put("se", "session�е�����");
		requst.put("req", "request��Χ������");
		return "main";
	}
	
	public String logout(){
		return "logout";
	}

	@Override
	public void setServletContext(ServletContext arg0) {
		this.sct=arg0;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.requst=arg0;
	}
	
}
