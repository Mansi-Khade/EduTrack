package com.tka.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.ClassSchedule;
@Repository
public class ClassScheduleDaoImp  implements ClassScheduleDao{

	@Autowired
	SessionFactory factory;
	
	//1.Get All Class Schedules
	@Override
	public List<ClassSchedule> getAllClassSchedule() {
		Session session =factory.openSession();
		Criteria c =session.createCriteria(ClassSchedule.class);
		List<ClassSchedule>  slist =c.list();
		return slist;
	}
	//2.Get Specific Class Schedule by id
	@Override
	public ClassSchedule getScheduleById(Long id) {
		Session session =factory.openSession();
		ClassSchedule c1=  session.get(ClassSchedule.class, id);
		return c1;
	}
	//3.Create a new Class Schedule
	@Override
	public String insertClassSchedules(ClassSchedule s) {
	Session session =factory.openSession();
    Transaction tx =session.beginTransaction();
    session.save(s);
    tx.commit();
    return "Data Inserted !!";
	}
	//4..Updating an existing Class Schedule
	@Override
	public String updateClassSchedule(ClassSchedule s, Long id) {
	Session session =factory.openSession();
	Transaction tx = session.beginTransaction();
    ClassSchedule  c1  =  session.get(ClassSchedule.class , id);
    c1.setSubjectid(s.getSubjectid());
    c1.setClassroomid(s.getClassroomid());
    c1.setDayOfWeek(s.getDayOfWeek());
    c1.setStartTime(s.getStartTime());
    c1.setEndTime(s.getEndTime());
    tx.commit();
    return "Updated Successfully!!";  
	}
	
	//5.Delete Class Schedule By specific id
	@Override
	public String DeleteById(Long id) {
	Session session  =factory.openSession();
	Transaction tx = session.beginTransaction();
	ClassSchedule  c1 = session.get(ClassSchedule.class, id);
	session.delete(c1);
	tx.commit();
	return  "Record Deleted!!";
	}

}
