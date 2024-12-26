package com.ns.employee.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ns.employee.dao.EmployeeDAO;
import com.ns.employee.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	static Session session = null;
	
	static
	{
		session = new Configuration().
				configure().
				buildSessionFactory().
				openSession();
	}
	
	public void insert(Employee e)
	{
		Transaction t = session.beginTransaction();
		session.persist(e);
		t.commit();
	}

	public Employee fetchOne(int id) 
	{
		return session.get(Employee.class, id);
	}

	public void update(Employee e) 
	{
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
	}

	public void delete(int id) 
	{
		session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		if(e != null)
		{
			session.delete(e);
			System.out.println("Obj is deleted");
		}
		else
		{
			System.out.println("No such data exist");
		}
		session.getTransaction().commit();
	}
	
	public List<Employee> fetchAll()
	{
		String hql = "from Employee";
		Query q = session.createQuery(hql);
		List<Employee> list = q.list();
		return list;
	}

}
