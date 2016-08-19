package practice.beanTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.autowiredTest.Person;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-bean-test.xml");
		/*Person person = (Person)ac.getBean("getChinese");*/
		Person person = (Person)ac.getBean("chinese");
		person.sayHello();
	}
}
