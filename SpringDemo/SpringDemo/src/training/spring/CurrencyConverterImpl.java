package training.spring;

import org.springframework.beans.factory.InitializingBean;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	public CurrencyConverterImpl() {
		super();
		System.out.println("in constructor");
		exchangeRate=0;
	}
	

	private double exchangeRate;

	public double getExchangeRate() {
		System.out.println("getExchangeRate()");		
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate()");		
		this.exchangeRate = exchangeRate;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeRate;
	}
	
	public void myInitMethod(){
		System.out.println("in start up method ");
	}

	
	
};