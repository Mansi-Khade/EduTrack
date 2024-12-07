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

import com.tka.entity.Subject;
import com.tka.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	SubjectService service;
	
	//1.Get All Subjects
	@GetMapping("/getAllSubjects")
	public List<Subject> getAllSubjects()
	{
		return service.getAllSubjects();
	}
	//2.Get a specific subject by id
	@GetMapping("/getSubjectById/{id}")   
	public Subject getSubjectById(@PathVariable Long id)
	{
		return service.getSubjectById(id);
	}
	//3.create new subject 
	@PostMapping("/insertSubject")
	public String insertSubject(@RequestBody Subject s)
	{
		return service.insertSubject(s);
	}
	//4.update existing subject by id
	@PutMapping("/updateSubject/{id}")   
	public String updateSubject(@RequestBody Subject s,@PathVariable Long id)
	{
		return service.updateSubject(s,id);
	}
	//5.Delete subject by id
	@DeleteMapping("/deleteSubjectById/{id}")
	public String deleteSubjectById(@PathVariable Long id)
	{
		return service.deleteSubjectById(id);
	}
	
	
}
