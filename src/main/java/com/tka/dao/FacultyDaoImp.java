
package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Faculty;
@Repository
public class FacultyDaoImp implements FacultyDao {

	@Autowired
	SessionFactory factory;
	
	//1.Get All Faculties
	@Override
	public List<Faculty> getAllFaculty() {
	Session session =factory.openSession();
	Criteria c =session.createCriteria(Faculty.class);
	List<Faculty> flist =c.list();
		return flist;
	}

	//2.Get a specific faculty by id
	@Override
	public Faculty getFacultyById(Long id) {
		Session session =factory.openSession();
		Faculty f = session.get(Faculty.class, id);
		return f;   
	}

	//3.create new Faculty
	@Override
	public String insertFaculty(Faculty f) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(f);
		tx.commit();
		return "Record Inserted.......";
	}
	//4.update existing faculty by id
	@Override
	public String updateFaculty(Faculty f, Long id) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Faculty f1 = session.get(Faculty.class, id);
		f1.setName(f.getName());
		f1.setEmail(f.getEmail());
		f1.setDepartmentid(f.getDepartmentid());     
		tx.commit();
		return "Record Updated......." ;   
	}
	//5.delete a faculty by id
	@Override
	public String deleteFacultyById(Long id) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Faculty f1 = session.get(Faculty.class, id);
		session.delete(f1);
		tx.commit();
		return "Record Deleted....";
	}
	
}
