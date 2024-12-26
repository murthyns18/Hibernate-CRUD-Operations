package com.ns.employee.dao;

import java.util.List;

import com.ns.employee.entity.Employee;

public interface EmployeeDAO 
{
	public void insert(Employee e);
	List<Employee> fetchAll();
	Employee fetchOne(int id);
	public void update(Employee e);
	public void delete(int id);
}
