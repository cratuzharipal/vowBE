package com.vow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vow.entity.Employee;
import com.vow.service.EmployeeService;

@RestController
public class DemoController {

	@Autowired
	private EmployeeService empService;
	@RequestMapping("api/hello")
	public String hello()
	{
		Employee e1=new Employee();
	     e1.setName("haripal");
	     empService.save(e1);
		return "hello";
	}
}
