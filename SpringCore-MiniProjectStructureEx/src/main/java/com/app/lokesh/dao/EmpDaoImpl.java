package com.app.lokesh.dao;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements IEmpDao {

	@Override
	public void save() {
		System.out.println("From save(-) method");
	}

}
