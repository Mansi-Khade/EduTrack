package com.tka.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
//@Table(name="class_schedules")
public class ClassSchedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "subject_id" , nullable =false)
	private Long subjectid;
	
	@Column(name = "classroom_id" , nullable =false)
	private Long classroomid;
	
	@Column(name = "day_of_week" , nullable =false)
	private String dayOfWeek;
	
	@Column(name = "start_time" , nullable =false)
	private Time startTime;
	
	@Column(name = "end_time" , nullable =false)
	private Time endTime;

	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassSchedule(Long id, Long subjectid, Long classroomid, String dayOfWeek, Time startTime, Time endTime) {
		super();
		this.id = id;
		this.subjectid = subjectid;
		this.classroomid = classroomid;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public Long getClassroomid() {
		return classroomid;
	}

	public void setClassroomid(Long classroomid) {
		this.classroomid = classroomid;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", subjectid=" + subjectid + ", classroomid=" + classroomid + ", dayOfWeek="
				+ dayOfWeek + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	

}
