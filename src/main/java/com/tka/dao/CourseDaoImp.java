package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Course;
@Repository
public class CourseDaoImp implements CourseDao {

	@Autowired
	SessionFactory factory;
	//1.get All courses
	@Override
	public List<Course> getAllCourses() {
		Session session  =factory.openSession();
		Criteria c =  session.createCriteria(Course.class);
		List<Course>  clist =c.list();
		return clist;
	}
	//2.get a specific course by id
	@Override
	public Course getCourseById(Long id) {
		Session session  =factory.openSession();
		Course c = session.get(Course.class, id);
		return c; 
	}
	//3.Create new Course
	@Override
	public String insertCourse(Course c) {
	Session session =factory.openSession();
	Transaction tx =session.beginTransaction();
	session.save(c);
	tx.commit();
		return  "Record Inserted Successfully!!";
	}
	
	//4.update an existing course
	@Override
	public String updateCourse(Long id, Course c) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Course c1 =session.get(Course.class, id);
		c1.setName(c.getName());
		tx.commit();
		return "updated Successfully";
	}
	
	//5.delete Course by Id 
	@Override
	public String deleteCourseById(Long id) {
		Session session =factory.openSession();
		Transaction tx =session.beginTransaction();
		Course c1 =session.get(Course.class, id);
		session.delete(c1);
		tx.commit();
		return "Record Deleted!!!";
	}
	
}
