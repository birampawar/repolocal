package training.spring;
public class CurrencyConverterImpl4 implements CurrencyConverter {
	
	public CurrencyConverterImpl4() {
		System.out.println("CurrencyConverterImpl()");
	}

	private ExchangeService4 exchangeService;

	public ExchangeService4 getExchangeService() {
		System.out.println("in getter");
		return exchangeService;
	}

	public void setExchangeService(ExchangeService4 exchangeService) {
		System.out.println("in Setter");
		this.exchangeService = exchangeService;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeService.getExchangeRate();
	}
};

