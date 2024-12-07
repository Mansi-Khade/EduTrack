package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Department;

@Repository
public class DepartmentDaoImp implements DepartmentDao{

	@Autowired
	SessionFactory factory;
    //1.Get All Department
	@Override
	public List<Department> getAllDepartment() {
		Session session =factory.openSession();
		Query q =session.createQuery("from  Department");
		List<Department> clist =q.list();
		return clist ;
	}
	//2.Get a  specific department by id
	@Override
	public Department getDepartmentById(Long id) {
		Session session =factory.openSession();
		Department d = session.get(Department.class, id);
		return d;
	}
	//3.Create new Department
	@Override
	public String insertDepartment(Department d) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(d);
		tx.commit();
		return "Record Inserted........";
	}
	//4.update existing department
	@Override
	public String updateDepartmentById(Long id, Department d) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Department d1 =session.get(Department.class, id);
		d1.setName(d.getName());
		tx.commit();
		return "Record Updated......";
	}
	//5.delete department by id
	@Override
	public String deleteDepartmentById(Long id) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Department d1 =session.get(Department.class, id);
		session.delete(d1);
		tx.commit();
		return "Record Deleted.......";
	}
	
	
	
	
}
