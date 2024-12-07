package com.tka.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.Classroom;

@Repository
public class ClassroomDaoImp implements ClassroomDao {

	@Autowired
	SessionFactory factory;
	
	//1.Get All Classrooms 
	@Override
	public List<Classroom> getAllClassrooms() {
	
		Session session =factory.openSession();
		Criteria c =session.createCriteria(Classroom.class);
	    List<Classroom> blist=	c.list();
	     System.out.println("bbcncgm");
	    return blist;   
	}
	//2.get specific classroom by id
	@Override
	public Classroom getClassroombyid(Long id) {
		Session session =factory.openSession();
		Classroom c =session.get(Classroom.class, id);
		return c;
	}
	
	//3.create new classroom insert record
	@Override
	public String insertClassroom(Classroom c) {
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
		return "Data Inserted Successfully"  ;
	}
	
	//4. update an existing classroom
	@Override
	public String updateClassroom(Classroom c, Long id) {
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		Classroom c1  = session.get(Classroom.class, id);
		c1.setId(c.getId());
		c1.setName(c.getName());   
		tx.commit();
		return "updated record successfully!";
	}
	//5.delete a class room by id
	@Override
	public String deleteClassroom(Long id) {
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		Classroom c1  = session.get(Classroom.class, id);
		session.delete(c1);
		tx.commit();
		return "deleted successfully! ";
	}

}
