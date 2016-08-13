package com.doctor.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.doctor.entity.Person;

/**
 * 练习Spring的自动拆箱装箱
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/springTest")
public class SpringTest {
	@RequestMapping("/getPerson")
	public String getPerson(Person person){
		System.out.println(person.toString());
		return "devanning";
	}
	/**
	 * 可以返回多个值
	 * @param person
	 * @param model
	 * @return
	 */
	@RequestMapping("/getPersonByModel")
	public String getPersonByModel(Person person,Model model){
		model.addAttribute("newPerson",person);
		model.addAttribute("hello","我是Model版Hello");
		return "devanning";
	}
	@RequestMapping("/getPersonByModelView")
	public ModelAndView getPersonByModelView(Person person){
		ModelAndView mv = new ModelAndView();
		mv.addObject("person",person);
		mv.addObject("hello","我是ModelAndView版 hello");
		
		mv.setViewName("devanning");
		return mv;
	}
	
	@RequestMapping("/inputPersonToServlet")
	public String  inputPersonToServlet(HttpServletRequest request) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		
		Person person = new Person();
		person.setName(name);
		person.setAge(Integer.parseInt(age));
		person.setSex(sex);
		System.out.println(person.toString());
		return "devanning";
	}
	@RequestMapping("/inputPersonByParameter")
	public String inputPersonByParameter(String name, String age, String sex){
		Person person = new Person();
		person.setName(name);
		person.setAge(Integer.parseInt(age));
		person.setSex(sex);
		System.out.println(person.toString());
		return "devanning";
	}
	@RequestMapping("/inputPersonAnnotation")
	public String inputPersonAnnotation(@RequestParam("username")String name,String age, String sex) {
		Person person = new Person();
		person.setName(name);
		person.setAge(Integer.parseInt(age));
		person.setSex(sex);
		System.out.println(person.toString());
		return "devanning";
	}
}
