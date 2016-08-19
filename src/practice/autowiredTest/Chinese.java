package practice.autowiredTest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(value=1)
@Component
public class Chinese implements Person {

	@Override
	public void sayHello() {
		System.out.println("你好,我是中国人！");
	}

}
