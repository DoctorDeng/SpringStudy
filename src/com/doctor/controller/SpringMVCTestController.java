package com.doctor.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 练习 SpringMVC 的使用
 * @author Doctor邓
 *
 */
@Controller
public class SpringMVCTestController {
	private Logger log = Logger.getLogger(SpringMVCTestController.class);
	@RequestMapping(value="/admin", method=RequestMethod.GET, params = "add")
	public String doSave() {
		log.debug("正在保存！");
		 
		return "";
	}
}
