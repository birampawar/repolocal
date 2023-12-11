package training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext(
				"context.xml");
		System.out.println("annotatedTarget:");
		System.out.println(bf.getBean("annotatedTarget"));
	}
}

class A {

	@Override
	public String toString() {
		return getClass().getName();
	}
}

class B {

	@Override
	public String toString() {
		return getClass().getName();
	}
}

class AnnotatedClass {
	@Autowired
	private A foo;
	@Autowired
	private A foo2;
	@Autowired
	private B bar;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("AnnotatedClass");
		sb.append("{foo=").append(foo);
		sb.append(", foo2=").append(foo2);
		sb.append(", bar=").append(bar);
		sb.append('}');
		return sb.toString();
	}
}
