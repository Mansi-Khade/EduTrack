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

import com.tka.entity.Faculty;
import com.tka.service.FacultyService;

@RestController
public class FacultyController {

	@Autowired
	FacultyService service;
	
	//1.Get All Faculties
	@GetMapping("/getAllFaculty")
	public List<Faculty> getAllFaculty()
	{
		return service.getAllFaculty();
	}
	
	//2.Get a specific faculty by id
	@GetMapping("/getFacultyById/{id}")
	public Faculty getFacultyById(@PathVariable Long id)
	{
		return service. getFacultyById(id);
	}
	//3.create new Faculty
	@PostMapping("/insertFaculty")
	public String insertFaculty(@RequestBody Faculty f)
	{
		return service.insertFaculty(f);
	}
	//4.update existing faculty by id
	@PutMapping("/updateFaculty/{id}")
	public String updateFaculty(@RequestBody Faculty f,@PathVariable Long id)
	{
		return service.updateFaculty(f,id);
	}
	//5.delete a faculty by id   
	@DeleteMapping("/deleteFacultyById/{id}")
	public String deleteFacultyById(@PathVariable Long id)
	{
		return service.deleteFacultyById(id);
	}
}
