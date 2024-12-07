package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.FacultyAttendance;
import com.tka.service.FacultyAttendanceService;

@RestController
public class FacultyAttendanceController {

	@Autowired
    FacultyAttendanceService service;
	
	
	@GetMapping("/getAllAttendanceDetails")
	public List<FacultyAttendance> getAllAttendanceDetails()
	{
		return service.getAllAttendanceDetails();
	}
	
	
	
}
