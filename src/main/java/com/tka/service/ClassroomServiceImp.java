package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassroomDao;
import com.tka.dao.ClassroomDaoImp;
import com.tka.entity.Classroom;
@Service
public class ClassroomServiceImp  implements ClassroomService{

	@Autowired
	ClassroomDao dao;
	//1.
	public List<Classroom> getAllClassrooms() {
	 return dao.getAllClassrooms();
	}
	//2.
	@Override
	public Classroom getClassroombyid(Long id) {
		
		return dao.getClassroombyid(id);
	}
	//3.
	@Override
	public String insertClassroom(Classroom c) {
		return dao.insertClassroom(c);
	}
	//4.
	@Override
	public String updateClassroom(Classroom c, Long id) {
		return dao.updateClassroom(c, id);
	}
	@Override
	public String deleteClassroom(Long id) {
		
		return dao.deleteClassroom(id);
	}

	
}
