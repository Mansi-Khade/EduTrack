package com.tka.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "faculties")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;   
	
	@Column(nullable =false)
	private String name;
	
	@Column(nullable =false,unique =true)
	private  String email;
	
	@Column(name="department_id" ,nullable = false)
	private Long departmentid;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(Long id, String name, String email, Long departmentid) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.departmentid = departmentid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", email=" + email + ", departmentid=" + departmentid + "]";
	}   

	
}
