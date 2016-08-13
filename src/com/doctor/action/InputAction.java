package com.doctor.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/input")
public class InputAction {
	@RequestMapping("/inputPerson")
	public String toInput() {
		return "binning";
	}
}
