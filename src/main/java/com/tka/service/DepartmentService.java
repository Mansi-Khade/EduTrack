package com.tka.service;

import java.util.List;

import com.tka.entity.Department;

public interface DepartmentService {

	List<Department> getAllDepartment();

	Department getDepartmentById(Long id);

	String insertDepartment(Department d);

	String updateDepartmentById(Long id, Department d);

	String deleteDepartmentById(Long id);

}
