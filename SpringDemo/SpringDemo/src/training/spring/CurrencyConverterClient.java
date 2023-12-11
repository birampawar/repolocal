package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {		
		/*Resource res = new ClassPathResource("currencyconverter.xml");
		BeanFactory factory = new XmlBeanFactory(res);*/
		ApplicationContext context = new ClassPathXmlApplicationContext("currencyconverter.xml");
		CurrencyConverter curr = 
			  (CurrencyConverter) context.getBean("currencyConverter");
				
		double rupees = curr.dollarsToRupees(60.0);
	
		System.out.println("60 $ is "+rupees+" Rs.");
	}
}
