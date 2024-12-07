package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CourseDao;
import com.tka.entity.Course;
@Service
public class CourseServiceImp implements CourseService {

	@Autowired
	CourseDao dao;
	//1.
	@Override
	public List<Course> getAllCourses() {
		return dao.getAllCourses();
	}
   //2.
	@Override
	public Course getCourseById(Long id) {
		return dao.getCourseById(id);  
	}
	//3.
	@Override
	public String insertCourse(Course c) {
		return dao.insertCourse(c);  
	}
	//4.
	@Override
	public String updateCourse(Long id, Course c) {
		return dao.updateCourse(id, c);
	}
	//5.
	@Override
	public String deleteCourseById(Long id) {
		return dao.deleteCourseById(id);  
	}
	
}
