package com.tka.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public interface ClassroomDao {

	List<Classroom> getAllClassrooms();
	
	Classroom getClassroombyid(Long id);
	
	String insertClassroom(Classroom c);
	
	String updateClassroom(Classroom c,Long id);
	
	String deleteClassroom(Long id);
}
