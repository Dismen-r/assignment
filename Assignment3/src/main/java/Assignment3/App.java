package Assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		User customer = context.getBean("u1", User.class);
		System.out.println(customer.getUsername());
		System.out.println(customer.getEmailid());
		
		Product p1 = context.getBean("p1",Product.class);
    	System.out.println(p1.getId());
    	System.out.println(p1.getName());
    	System.out.println(p1.getDescription());
    	System.out.println(p1.getRating());
	}
}
