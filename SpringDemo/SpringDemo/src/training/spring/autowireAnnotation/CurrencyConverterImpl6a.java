package training.spring.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import training.spring.CurrencyConverter;
import training.spring.ExchangeService;

public class CurrencyConverterImpl6a implements CurrencyConverter {

	public CurrencyConverterImpl6a() {
		System.out.println("CurrencyConverterImpl()");
	}

	@Autowired
	@Qualifier("exchangeService")
	private ExchangeService exchangeService;

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");
		return exchangeService;
	}

	@Autowired
	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");
		return dollars * exchangeService.getExchangeRate();
	}
};