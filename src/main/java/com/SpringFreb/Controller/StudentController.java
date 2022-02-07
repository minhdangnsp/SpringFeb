package com.SpringFreb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFreb.Entities.Student;
import com.SpringFreb.Response.StudentResponse;
import com.SpringFreb.Service.StudentService;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
//	@GetMapping("/get")
//	public StudentResponse getStudent() {
//		return "Hello Student";
//		Student student = new Student(1, "John", "Smith", "john_smith@gmail.com");
//		Student studentresponse = new StudentResponse(student));
//		return studentresponse;
//	}
	
	@GetMapping("/getAll")
	public List<StudentResponse> getAllStudents() {
		List<Student> studentList =  studentService.getAllStudents();
		List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();
		
		for (Student item : studentList) {
			studentResponseList.add(new StudentResponse(item));
		}
		return studentResponseList;
		
	}

}
