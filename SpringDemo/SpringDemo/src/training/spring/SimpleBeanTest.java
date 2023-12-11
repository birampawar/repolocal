package training.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import training.spring.CurrencyConverter;
public class SimpleBeanTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SimpleBeanconfig.xml");
			SimpleBean sbean = (SimpleBean) ctx.getBean("simpleBean");
						
    }
}
