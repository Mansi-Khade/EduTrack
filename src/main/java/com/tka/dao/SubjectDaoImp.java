package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Subject;

@Repository
public class SubjectDaoImp  implements SubjectDao{

	@Autowired
	SessionFactory factory;

	@Override
	public List<Subject> getAllSubjects() {
	Session session =factory.openSession();
	Criteria c =session.createCriteria(Subject.class);
	  List<Subject> slist = c.list();
		return slist;
	}
	//2.Get a specific subject by id
	@Override
	public Subject getSubjectById(Long id) {
		Session session =factory.openSession();
		Subject s =session.get(Subject.class, id);
		return s;
	}
	//3.create new subject 
	@Override
	public String insertSubject(Subject s) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(s);
		tx.commit();
		return "Record Inserted....";     
	}
	//4.update existing subject by id
	@Override
	public String updateSubject(Subject s, Long id) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Subject s1 =session.get(Subject.class, id);
		s1.setName(s.getName());
		s1.setCourseId(s.getCourseId()); 
		tx.commit();
		return "Record Updated......";     
	}
	//5.Delete subject by id
	@Override
	public String deleteSubjectById(Long id) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Subject s1 =session.get(Subject.class, id);
		session.delete(s1);
		tx.commit();
		return "Record Deleted...";  
	}
	
	
	
}
