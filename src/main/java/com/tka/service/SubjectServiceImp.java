package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.SubjectDao;
import com.tka.entity.Subject;

@Service
public class SubjectServiceImp implements SubjectService {
	
	@Autowired
	SubjectDao dao;
    //1
	@Override
	public List<Subject> getAllSubjects() {
		return dao.getAllSubjects();
	}
	
	//2
	@Override
	public Subject getSubjectById(Long id) {
		return dao.getSubjectById(id); 
	}
	//3
	@Override
	public String insertSubject(Subject s) {
		return dao.insertSubject(s); 
	}
	//4
	@Override
	public String updateSubject(Subject s, Long id) {
		return dao.updateSubject(s, id);
	}
	//5
	@Override
	public String deleteSubjectById(Long id) {
		return dao.deleteSubjectById(id);    
	}
	

}
