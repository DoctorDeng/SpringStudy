package com.doctor.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/input")
public class InputAction {
	/**
	 * 转到输入页面
	 * @return
	 */
	@RequestMapping("/inputPerson")
	public String toInput() {
		return "binning";
	}
	@RequestMapping("/inputAjax")
	public String inputAjax(){
		return "testAjax";
	}
}
