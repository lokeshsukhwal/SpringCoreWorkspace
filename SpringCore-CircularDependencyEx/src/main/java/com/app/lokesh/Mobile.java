package com.app.lokesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("iphone")
	private String model;
	@Autowired
	private Human human; //HAS-A

	public Mobile() {
		super();
		System.out.println("Mobile default constructor.......!");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	
	/* 								problem statement  (circular dependency)
	 * both class having dependencies of each other [connected with HAS-A relation]
	 * so we will get  we will get a java.lang.StackOverflowError because of both class
	 *   having toString(-) method and they are internally calling each other 
	 *   
	 *   								solution statement
	 *   remove any class toString(-) method  then it's work's as expected 
	  */

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", human=" + human + "]";
	}
	
	  
	 

}
