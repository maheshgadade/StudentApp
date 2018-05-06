package com.student.service;

import java.sql.SQLException;

import com.student.model.Student;

public interface StudentService {
	public void saveStudent(Student student) throws SQLException;
	

}
