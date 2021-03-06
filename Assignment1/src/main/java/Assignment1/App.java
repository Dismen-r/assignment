package Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("OnlineShop.xml");
		User customer = context.getBean("u1", User.class);
		System.out.println(customer.getUsername());
		System.out.println(customer.getEmail());
		System.out.println(customer.getShipping_address());
		
		
		Product p = context.getBean("p1", Product.class);
		System.out.println(p.getProduct_name());
		System.out.println(p.getPrice());
		
		Cart c=context.getBean("c1", Cart.class);
		System.out.println(c.getTotal_amount());
		System.out.println(c.getStatus());
		
		Order o=context.getBean("o1", Order.class);
		System.out.println(o.getCartList());
		
	
	}
}
