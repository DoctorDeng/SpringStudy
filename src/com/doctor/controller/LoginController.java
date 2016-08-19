package com.doctor.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
/**
 * 登录控制类
 * @author Doctor邓
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController implements  ServletContextAware {
/*	@Autowired
	private ServletContext servletContext;*/
	
	private ServletContext servletContext;  
	public void setServletContext(ServletContext sc) {  
	    this.servletContext=sc;  
	    System.out.println("项目的绝对路径为："+servletContext.getRealPath("/"));  
	}  
	/**
	 * 跳转到用户登录页面 
	 * @return
	 */
	@RequestMapping("/userLogin")
	public String userLogin(HttpServletRequest request,HttpSession session){
	    HttpServletRequest request1 =  ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println("相对路径:"+servletContext.getContextPath());
		System.out.println("绝对路径:"+servletContext.getRealPath(""));
		System.out.println("根路径:"+servletContext.getRealPath("/"));
		request.getSession().setAttribute("aaa", "测试");
		if (request1 == request) {
			System.out.println("正确！");
		} else {
			System.out.println(request1);
			System.out.println(request);
			System.out.println("错误！");
		}
		/*Map<String,Object> session=ActionContext.getContext().getSession();
		System.out.println(session.get("aaa"));*/
		System.out.println(servletContext);
		return "login";
	}
}
