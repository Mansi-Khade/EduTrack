package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.ClassSchedule;
import com.tka.service.ClassScheduleService;
import java.util.List;

@RestController
public class ClassScheduleController {

	@Autowired
	ClassScheduleService service;
	//1.Get All Class Schedules
	@GetMapping("/getAllClassSchedules")   
	public List<ClassSchedule> getAllClassSchedule()
	{
		return service.getAllClassSchedule();
	}
	
	//2.Get Specific Class Schedule by id
	@GetMapping("/getScheduleById/{id}")      
	public ClassSchedule  getScheduleById(@PathVariable Long id)
	{
		return service.getScheduleById(id);	
	}
	
	//3.Create a new Class Schedule
	@PostMapping("/insertnewClassSchedule") 
	public String insertClassSchedules(@RequestBody ClassSchedule s)
	{
		return service.insertClassSchedules(s);
	}
	
	//4.Updating an existing Class Schedule
	@PutMapping("/updateClassSchedule/{id}")
	public String updateClassSchedule(@RequestBody ClassSchedule s , @PathVariable Long id)
	{
		return service.updateClassSchedule(s,id);
	}

	//5.Delete Class Schedule By specific id
	@DeleteMapping("/DeleteById/{id}")
	public String DeleteById(@PathVariable Long id)
	{
		return service.DeleteById(id);  
	}

}
