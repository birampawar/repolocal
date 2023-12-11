/******package training.spring.annotation;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import training.spring.CurrencyConverter;

@Component("currencyConverter")
public class CurrencyConverterImpl9 implements CurrencyConverter {
	
	@PostConstruct
	void init(){
		System.out.println("in init() - called thru @PostConstruct");
	}
	
	@PreDestroy
	void destroy(){
		System.out.println("in destroy() - called thru @PreDestroy");
	}
	
	public CurrencyConverterImpl9() {
		System.out.println("CurrencyConverterImpl()");
	}
	@Autowired
	public CurrencyConverterImpl9(ExchangeServiceImpl9 exchangeService) {
		System.out.println("CurrencyConverterImpl()");
		this.exchangeService = exchangeService;
	}
	
	@Autowired
	private ExchangeServiceImpl9 exchangeService;

	public ExchangeServiceImpl9 getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	@Autowired
	public void setExchangeService(ExchangeServiceImpl9 exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};**********/