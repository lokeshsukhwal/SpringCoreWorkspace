package com.app.lokesh;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//Dependency [child]
public class Token {
	private Integer code;

	public Token() {
		super();
//		it will generate every time new positive integer number
		code = Math.abs(new Random().nextInt());
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}

}
