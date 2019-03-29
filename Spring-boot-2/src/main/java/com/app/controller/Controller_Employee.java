package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class Controller_Employee {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value="/employee-details")
	public void getEmployeeDetails() {
		System.out.println("Employee Details..!!"+employeeService.getEmployeeDetails());
	}
}
