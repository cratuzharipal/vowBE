package com.vow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vow.entity.Employee;
import com.vow.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	public void save(Employee e1)
	{
	     empRepo.save(e1);
	}
}
