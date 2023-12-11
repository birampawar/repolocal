package training.spring.schemaAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.spring.aop.Business;

public class BusinessDemo1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"schemaaop.xml");
		Business bc = (Business) context.getBean("myBusinessClass");
		try {
            bc.doBusiness();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}