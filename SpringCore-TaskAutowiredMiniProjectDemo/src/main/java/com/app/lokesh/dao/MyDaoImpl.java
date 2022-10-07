package com.app.lokesh.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDaoImpl implements IMyDao {
	@Value("SAMPLE-VALUE")
	private String sample;

	@Override
	public String toString() {
		return "MyDaoImpl [sample=" + sample + "]";
	}

}
