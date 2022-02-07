package com.SpringFreb.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	public Long id;
	
	@Column(name="first_Name")
	public String firstName;
	
	@Column(name="last_Name")
	public String lastName;
	
	@Column(name="email")
	public String email;

}
