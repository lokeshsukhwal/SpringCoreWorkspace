package com.app.lokesh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AdvanceProcess implements Iprocess {

	@Override
	public void getProcessCode() {
		System.out.println("Advance process method");
	}

}
