package com.springbasic.rest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.springbasic.rest.Models.DataModels.Student;
import com.springbasic.rest.Models.StandardRequestModels.StandardResponse;
import com.springbasic.rest.Services.StudentService;  

@RestController
public class StudentController {
	
	StudentService studentService = new StudentService();
	
	@GetMapping("/student")
	public ResponseEntity<StandardResponse> getStudent(){
		List<Student> studentList = this.studentService.getStudentList();
		return new ResponseEntity(
				new StandardResponse(
						"200","Found Students",studentList),HttpStatus.OK);
	}
	
	@GetMapping("/student/{studentId}")
	public ResponseEntity<StandardResponse> getStudentById(@PathVariable String studentId){
		Student s = this.studentService.getStudentById(studentId);
		if(s!=null) {
			return new ResponseEntity( new StandardResponse(
					"200","Found Student",s),HttpStatus.OK);
		}
	
		return new ResponseEntity(new StandardResponse("400","Student found",null),HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(
			value = "/student",
	        produces = {MediaType.APPLICATION_JSON_VALUE}
	)
	public ResponseEntity<StandardResponse> createStudent(@RequestBody Student newStudent) {
		this.studentService.createStudent(newStudent);
		
		return new ResponseEntity(
				new StandardResponse(
						"200",
						"student created successfully",
						newStudent)
				,HttpStatus.OK);
	}
}
