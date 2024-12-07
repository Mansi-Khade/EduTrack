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

import com.tka.entity.Department;
import com.tka.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	//1.Get All Department
	@GetMapping("/getAllDepartment")   
	public List<Department> getAllDepartment()
	{
		return service.getAllDepartment();
	}
	//2.Get a  specific department by id
	@GetMapping("/getDepartmentById/{id}")
	public Department getDepartmentById(@PathVariable Long id)
	{
		return service.getDepartmentById(id);
	}
	//3.Create new Department
	@PostMapping("/insertDepartment")
	public String insertDepartment(@RequestBody Department d)
	{
		return service.insertDepartment(d);
	}
	//4.update existing department
	@PutMapping("/updateDepartmentById/{id}")
	public String updateDepartmentById(@PathVariable Long id,@RequestBody Department d)
	{
		return service.updateDepartmentById(id,d);
	}
	//5.delete department by id
	@DeleteMapping("/DeleteDepartmentById/{id}")
	public String deleteDepartmentById(@PathVariable Long id)
	{
		return service.deleteDepartmentById(id);
	}
	
}
