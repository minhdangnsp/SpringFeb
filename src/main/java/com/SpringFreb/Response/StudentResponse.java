package com.SpringFreb.Response;

import com.SpringFreb.Entities.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {
	
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	
//	public StudentResponse(long id, String firstName, String lastName) {
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
	
	public StudentResponse(Student student) {
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
	}
	

	
}
