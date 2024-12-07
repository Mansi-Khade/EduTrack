package com.tka.dao;

import java.util.List;

import com.tka.entity.Course;

public interface CourseDao {

	List<Course> getAllCourses();
	
	Course getCourseById(Long id);
	
	String insertCourse(Course c);
	
	String updateCourse(Long id, Course c);
	
	String deleteCourseById(Long id);

}
