package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassScheduleDao;
import com.tka.entity.ClassSchedule;
@Service
public class ClassScheduleServiceImp implements ClassScheduleService {

	@Autowired
	ClassScheduleDao dao;
	
	//1.
	@Override
	public List<ClassSchedule> getAllClassSchedule() {
		return dao.getAllClassSchedule();
	}
	//2.
	@Override
	public ClassSchedule getScheduleById(Long id) {
		
		return dao.getScheduleById(id);
	}
	//3.
	@Override
	public String insertClassSchedules(ClassSchedule s) {
		return dao.insertClassSchedules(s);    
	}
	//4.
	@Override
	public String updateClassSchedule(ClassSchedule s, Long id) {
			return dao.updateClassSchedule(s, id);  
	}
	@Override
	public String DeleteById(Long id) {
		return dao.DeleteById(id);  
	}

	
}
