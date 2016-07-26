package com.paramreceive.action;

import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.paramreceive.entity.User;

/**
 * 使用通配符的方式
 */
public class UserActionWildcard extends BaseAction<User> implements ServletContextAware,RequestAware,SessionAware{

	private static final long serialVersionUID = 1L;
	private ServletContext sct;
	private Map<String, Object> session;
	private Map<String, Object> requst;

	public String login(){
		
		/*第一种
//		ActionContext context = ActionContext.getContext();//request范围
//		context.put("req", "request范围的数据");
//		context.getApplication().put("app", "application范围的数据");
//		context.getSession().put("se", "session范围的数据");
//		
//		context.getSession().put("user", model);
		*/
		
		//application域
		/*第二种
//		ServletContext servletContext = ServletActionContext.getServletContext();
//		servletContext.setAttribute("app", "servletContext范围的数据");
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("req", "request中的数据");
//		HttpSession session = request.getSession();
//		session.setAttribute("se", "session中的数据");
		*/
		sct.setAttribute("app", "servletContext范围的数据");
		session.put("se", "session中的数据");
		requst.put("req", "request范围的数据");
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
