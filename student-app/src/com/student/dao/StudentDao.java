package com.student.dao;

import java.sql.SQLException;

import com.student.model.Student;

public interface StudentDao {
	public void saveStudent(Student student) throws SQLException;
	

}
