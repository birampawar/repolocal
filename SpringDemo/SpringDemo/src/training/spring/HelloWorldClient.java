package training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldClient {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorld.xml");
      HelloWorld obj = (HelloWorld) context.getBean("HelloWorldBean");
      obj.sayHello();
   }
}


