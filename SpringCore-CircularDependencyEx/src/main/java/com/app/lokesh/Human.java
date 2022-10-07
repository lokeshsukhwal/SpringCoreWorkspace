package com.app.lokesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
	@Value("lokesh")
	private String name;
	@Autowired
	private Mobile mobile; //HAS-A

	public Human() {
		super();
		System.out.println("Human default constructor.......!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", mobile=" + mobile + "]";
	}

}
