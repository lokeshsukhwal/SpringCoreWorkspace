package com.app.lokesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// Reading First Time
		TokenService tokenOne = context.getBean("tokenService", TokenService.class);
		Token t1 = tokenOne.getToken();
		System.out.println(
				"Parent HashCode = " + tokenOne.hashCode() + "<--*****-->" + "Child HashCode = " + t1.hashCode()
				);

		// Reading Second Time
		TokenService tokenTwo = context.getBean("tokenService", TokenService.class);
		Token t2 = tokenTwo.getToken();
		System.out.println(
				"Parent HashCode = " + tokenTwo.hashCode() + "<--*****-->"+ "Child HashCode = " + t2.hashCode()
				);
	}
}
