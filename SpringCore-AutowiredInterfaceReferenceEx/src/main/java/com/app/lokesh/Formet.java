package com.app.lokesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Formet {
	@Autowired
	/* manual object selected by programmer if we use 	@Qualifier
	 * but 	@Qualifier always dominates @Primary 
	  */
	@Qualifier("advanceProcess")
	private Iprocess iprocess;

	public void printFormat() {
		iprocess.getProcessCode();
		System.out.println("from format class method");
	}

	@Override
	public String toString() {
		return "Formet [iprocess=" + iprocess + "]";
	}

}
