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
import com.tka.entity.Classroom;
import com.tka.service.ClassroomService;

@RestController
public class ClassroomController {

	@Autowired
	ClassroomService service;
	
	//1.Get All Classrooms 
	@GetMapping("/getAllClassrooms")
	public List<Classroom>  getAllClassrooms()
	{
		return service.getAllClassrooms(); 
	}
	
	//2.get specific classroom by id
	@GetMapping("/getClassroomById/{id}")
	public Classroom getClassroombyid(@PathVariable Long id)
	{
		return service.getClassroombyid(id) ; 
	}
	
	//3.create new classroom insert record
	@PostMapping("/insertnewClassroom")
	public String  insertClassroom(@RequestBody Classroom c)
	{
		return service.insertClassroom(c) ;
	}
	
	//4. update an existing classroom
	@PutMapping("/updateClassroom/{id}")
	public String updateClassroom(@RequestBody Classroom c,@PathVariable Long id)
	{
		return  service.updateClassroom(c, id); 
	}
	
	//5.delete a class room by id
	@DeleteMapping("/getDeleteById/{id}")
	public String deleteClassroom(@PathVariable Long id)
	{
		return service.deleteClassroom(id);
	}
	
	
}
