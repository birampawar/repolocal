package training.spring;

public class ExchangeServiceImpl6 implements ExchangeService {

	public ExchangeServiceImpl6() {
		System.out.println("ExchangeServiceImpl()");
	}
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return 65;
	}
}
