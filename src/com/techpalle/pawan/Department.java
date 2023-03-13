package com.techpalle.pawan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String deptName;
	private String location;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public Department(int id, String deptName, String location) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.location = location;
	}
	
	
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}
	
	public Department() {
		super();
		
	}
}
