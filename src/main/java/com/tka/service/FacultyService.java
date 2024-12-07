package com.tka.service;

import java.util.List;

import com.tka.entity.Faculty;

public interface FacultyService {

	List<Faculty> getAllFaculty();

	Faculty getFacultyById(Long id);

	String insertFaculty(Faculty f);

	String updateFaculty(Faculty f, Long id);

	String deleteFacultyById(Long id);

}
