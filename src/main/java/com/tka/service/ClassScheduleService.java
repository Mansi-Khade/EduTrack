package com.tka.service;

import java.util.List;

import com.tka.entity.ClassSchedule;

public interface ClassScheduleService {

	
	List<ClassSchedule> getAllClassSchedule();

	ClassSchedule getScheduleById(Long id);

	String insertClassSchedules(ClassSchedule s);

	String updateClassSchedule(ClassSchedule s, Long id);

	String DeleteById(Long id);
	
	

}
