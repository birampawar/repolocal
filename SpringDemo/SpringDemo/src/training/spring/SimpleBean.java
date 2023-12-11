package training.spring;
//include common-annotations.jar in classpath
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleBean {

	/*The PostConstruct annotation is used on a method that needs to be executed after 
	dependency injection is done to perform any initialization. This method MUST be 
	invoked before the class is put into service.*/
	
	public SimpleBean() {
		super();
		System.out.println("simple bean constructed");
	}

	@PostConstruct
	public void initialize(){
		System.out.println("Initializing bean" + getClass());
	}
	/*The PreDestroy annotation is used on methods as a callback notification to signal 
	that the instance is in the process of being removed by the container. The method 
	annotated with PreDestroy is typically used to release resources that it has been holding.*/
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("Cleaning up bean" + getClass());
	}
}
