package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.DepartmentDao;
import com.tka.entity.Department;
@Service
public class DepartmentServiceImp  implements DepartmentService{
	@Autowired
    DepartmentDao dao;
    //1
	@Override
	public List<Department> getAllDepartment() {
		return dao.getAllDepartment();
	}
   //2
	@Override
	public Department getDepartmentById(Long id) {
		return dao.getDepartmentById(id);   
	}
    //3
	@Override
	public String insertDepartment(Department d) {
		return dao.insertDepartment(d);
	}  
    //4
	@Override
	public String updateDepartmentById(Long id, Department d) {
		return dao.updateDepartmentById(id, d);   
	}
	//5
	@Override
	public String deleteDepartmentById(Long id) {
		return dao.deleteDepartmentById(id);
	}
	
	
}
