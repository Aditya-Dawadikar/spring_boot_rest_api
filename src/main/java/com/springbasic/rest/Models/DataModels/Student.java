package com.springbasic.rest.Models.DataModels;

public class Student {
	
	private String id;
	private String fname;
	
	public Student(String id,String fname){
		this.id = id;
		this.fname = fname;
	}
	
	public String getId() {
		return this.id;
	}
	public String getFname() {
		return this.fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setId(String id) {
		this.id =  id;
	}
}
