package com.doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 登录控制类
 * @author Doctor邓
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	/**
	 * 跳转到用户登录页面 
	 * @return
	 */
	@RequestMapping("/userLogin")
	public String userLogin(){
		return "login";
	}
}
