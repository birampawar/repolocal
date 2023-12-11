package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class CurrencyConverterClient6 {

	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("currencyconverter6.xml");
			CurrencyConverter curr = (CurrencyConverter) context.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("100 $ is "+rupees+" Rs.");
	}
}
