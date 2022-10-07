package com.app.lokesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Product.class);
		Product product = context.getBean("product", Product.class);
		System.out.println(product);
	}
}
