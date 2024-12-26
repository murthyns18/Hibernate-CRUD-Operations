package com.ns.employee.main;

import java.util.List;
import java.util.Scanner;

import com.ns.employee.daoimpl.EmployeeDAOImpl;
import com.ns.employee.entity.Employee;

public class LaunchEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		EmployeeDAOImpl hm = new EmployeeDAOImpl();


		System.out.println("1 : Insert an employee\n"
				+"2 : Fetch an employee\n"
				+"3 : Update an employee\n"
				+"4 : Delete an employee\n"
				+"5 : Fetch all employees");
		int option = sc.nextInt();

		switch(option)
		{
		case 1 :
			System.out.println("Enter emp id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter emp name");
			String name = sc.nextLine();
			System.out.println("Enter emo dept");
			String dept = sc.nextLine();
			System.out.println("Enter emp salary");
			int sal = sc.nextInt();
			Employee e = new Employee(id,name,dept,sal);
			hm.insert(e);
			System.out.println("Object is added");
			break;

		case 2 :
			System.out.println("Enter emp id");
			int empid = sc.nextInt();
			Employee ee = hm.fetchOne(empid);
			System.out.println(ee);
			break;

		case 3 :
			System.out.println("Enter emp id");
			int id2 = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter emp name");
			String name2 = sc.nextLine();
			System.out.println("Enter emo dept");
			String dept2 = sc.nextLine();
			System.out.println("Enter emp salary");
			int sal2 = sc.nextInt();
			Employee eee = new Employee(id2,name2,dept2,sal2);
			hm.update(eee);
			System.out.println("Object is updated successfully");
			break;

		case 4 :
			System.out.println("Enter emp id");
			int id3=sc.nextInt();
			hm.delete(id3);
			break;

		case 5 :
			List<Employee> list = hm.fetchAll();
			for(Employee emp : list)
			{
				System.out.println(emp);
			}
			break;

		case 6 : 
			System.out.println("Invalid choice");

		}

	}
}
