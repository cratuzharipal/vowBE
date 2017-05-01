package com.vow.repository;

import java.util.List;

import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.MorphiaDataStore;
import com.vow.entity.Employee;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	private MorphiaDataStore mds;
	public void save(Employee e1)
	{
		System.out.println("gggggggggggggggggggggggg"+mds.getInstance().getConnection()+e1.getName());
	    mds.getInstance().getConnection().save(e1);
	    System.out.println("Haripal");
	     final Query<Employee> query = mds.getInstance().getConnection().createQuery(Employee.class);
	     final List<Employee> employees = query.asList();
	     for(Employee emp:employees)
	     {
	     System.out.println("+++++++++++++++++++++"+emp.getId()+"/n######"+emp.getName());
		 }
	}
}
