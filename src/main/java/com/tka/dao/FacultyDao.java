package com.tka.dao;

import java.util.List;

import com.tka.entity.Faculty;

public interface FacultyDao {

	List<Faculty> getAllFaculty();
	
	Faculty getFacultyById(Long id);
	
	String insertFaculty(Faculty f);
	
	String updateFaculty(Faculty f, Long id);
	
	String deleteFacultyById(Long id);
}
