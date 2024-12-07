package com.tka.service;

import java.util.List;

import com.tka.entity.Subject;

public interface SubjectService {

	List<Subject> getAllSubjects();

	Subject getSubjectById(Long id);

	String insertSubject(Subject s);

	String updateSubject(Subject s, Long id);

	String deleteSubjectById(Long id);
	
	

}
