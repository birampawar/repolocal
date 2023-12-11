package training.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import training.spring.CurrencyConverter;
public class CurrencyConverterClient4 {

	public static void main(String args[]) throws Exception {
		Resource res = new ClassPathResource("currencyconverter4.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		CurrencyConverter curr = (CurrencyConverter) 
		        factory.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
/*Traditionally we would have written it as
ExchangeService exch=new ExchangeServiceImpl();
double d=exch.getExchangeRate();*/