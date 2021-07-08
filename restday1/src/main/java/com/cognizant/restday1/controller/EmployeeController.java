package com.cognizant.restday1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.restday1.model.Employee;
import com.cognizant.restday1.service.EmployeeServiceI;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceI employeeService;

	@PostMapping(value = "/addEmployee")

	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return new ResponseEntity<String>("Employee Added Successfully", HttpStatus.OK);

	}
}
