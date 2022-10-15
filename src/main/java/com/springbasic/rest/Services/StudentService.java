package com.springbasic.rest.Services;

import java.util.ArrayList;
import java.util.List;

import com.springbasic.rest.Models.DataModels.Student;

public class StudentService {
	
	List<Student> studentList = new ArrayList<Student>();
	
	public StudentService(){
		this.studentList.add(new Student("100","abc"));
		this.studentList.add(new Student("101","ghi"));
		this.studentList.add(new Student("102","mno"));
		this.studentList.add(new Student("103","stu"));
	}
	
	public List<Student> getStudentList(){
		return this.studentList;
	}
	
	public Student getStudentById(String id){
		for(int i=0;i<this.studentList.size();i++) {
			if(this.studentList.get(i).getId().equals(id)) {
				return this.studentList.get(i);
			}
		}
		return null;
	}
	
	public void createStudent(Student s){
		this.studentList.add(s);
	}
}
