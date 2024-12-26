package com.ns.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee
{
	@Id
	@Column(name="empId")
	private int empId;
	@Column(name="empName")
	private String empName;
	@Column(name="empDept")
	private String empDept;
	@Column(name="salary")
	private int salary;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int empId, String empName, String empDept, int salary) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.salary = salary;
	}
	
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public String getEmpDept() 
	{
		return empDept;
	}
	public void setEmpDept(String empDept) 
	{
		this.empDept = empDept;
	}
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return empId + "  " + empName + "  " + empDept + "  " + salary;
	}
	
	
	
}
