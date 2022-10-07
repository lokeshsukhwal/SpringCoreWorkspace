package com.app.lokesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.lokesh.dao.IEmpDao;

@Component
public class EmpServiceImpl implements IEmpService {
	@Autowired
	private IEmpDao iEmpDao;

	@Override
	public void checkLogic() {
		iEmpDao.save();
		System.out.println("checkLogic(-) method");
	}

}
