package training.spring;
public class CurrencyConverterImpl6 implements CurrencyConverter {
	
	public CurrencyConverterImpl6() {
		System.out.println("CurrencyConverterImpl()");
	}

	private ExchangeService exchangeService;

	public ExchangeService getExchangeService() {
		System.out.println("getExchangeService()");		
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");		
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};