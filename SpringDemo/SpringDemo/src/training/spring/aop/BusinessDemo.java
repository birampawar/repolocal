package training.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class BusinessDemo {
 
        public static void main(String[] args) {
                ApplicationContext context = 
                	new ClassPathXmlApplicationContext("business.xml");
                Business bc = (Business) context.getBean("myBusinessClass");
                               
                //try {
                bc.doBusiness();
				//} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
                
        }
}