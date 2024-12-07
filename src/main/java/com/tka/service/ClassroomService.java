package com.tka.service;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.entity.Classroom;
@Service
public interface ClassroomService {

	List<Classroom> getAllClassrooms();
	
	Classroom getClassroombyid(Long id);
	
	String insertClassroom(Classroom c);
	
	String updateClassroom(Classroom c,Long id);
	
	String deleteClassroom(Long id);
}
