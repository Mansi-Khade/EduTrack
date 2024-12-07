package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.FacultyAttendance;
@Repository
public class FacultyAttendnaceDao {

	@Autowired
	SessionFactory factory;
	
	public List<FacultyAttendance> getAllAttendanceDetails() {
	Session session=factory.openSession();
	Criteria c = session.createCriteria(FacultyAttendance.class);
	List<FacultyAttendance>  flist= c.list();
		return flist;
	}

	
}
