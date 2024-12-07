package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.FacultyDao;
import com.tka.entity.Faculty;
@Service
public class FacultyServiceImp  implements FacultyService{

	@Autowired
	FacultyDao dao;
	
	//1
	@Override
	public List<Faculty> getAllFaculty() {
		return dao.getAllFaculty();  
	}

	//2
	@Override
	public Faculty getFacultyById(Long id) {
		return dao.getFacultyById(id);   
	}

	//3
	@Override
	public String insertFaculty(Faculty f) {
		return dao.insertFaculty(f);
	}
   //4
	@Override
	public String updateFaculty(Faculty f, Long id) {
		return dao.updateFaculty(f, id);   
	}
	//5

	@Override
	public String deleteFacultyById(Long id) {
		return dao.deleteFacultyById(id);
	}


	
	
}
