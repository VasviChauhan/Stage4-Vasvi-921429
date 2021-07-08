package com.cognizant.restday1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restday1.model.Employee;
import com.cognizant.restday1.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

}
