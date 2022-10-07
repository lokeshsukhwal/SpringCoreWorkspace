package com.app.lokesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProgressData {
	@Value("MODEL")
	private String model;

	public ProgressData() {
		super();
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "ProgressData [model=" + model + "]";
	}

}
