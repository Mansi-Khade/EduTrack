package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.FacultyAttendnaceDao;
import com.tka.entity.FacultyAttendance;
@Service
public class FacultyAttendanceService {
    @Autowired
	FacultyAttendnaceDao dao;
	public List<FacultyAttendance> getAllAttendanceDetails() {
	
		return dao. getAllAttendanceDetails() ;   
	}

}
