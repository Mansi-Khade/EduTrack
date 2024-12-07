package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Course;
import com.tka.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService service;
	//1.get All courses
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourses()
	{
		return service.getAllCourses();
	}
	
	//2.get a specific course by id
	@GetMapping("/getCourseById/{id}")
	public Course getCourseById(@PathVariable Long id)
	{
		return service.getCourseById(id);
	}
	//3.Create new Course
	@PostMapping("/insertnewCourse")
	public String insertCourse(@RequestBody Course c)
	{
		return service.insertCourse(c);
	}
	//4.update an existing course
	@PutMapping("/updateCourseById/{id}")
	public String updateCourse(@PathVariable Long id,@RequestBody Course c)
	{
		return service.updateCourse(id,c);
	}
	//5.delete Course by Id 
	@DeleteMapping("/DeleteCourseById/{id}")
	public String deleteCourseById(@PathVariable Long id)
	{
		return service.deleteCourseById(id);
	}
	
}
