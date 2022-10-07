package com.app.lokesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Token token1 = context.getBean("token", Token.class);
		System.out.println(token1.hashCode());

		Token token2 = context.getBean("token", Token.class);
		System.out.println(token2.hashCode());

	}
}
