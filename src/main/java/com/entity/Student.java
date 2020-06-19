package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "STUDENT_TBL")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private int id;
	private String name;
	private int age;
}
