package com.student.service;

import java.sql.SQLException;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.model.Student;

public class StudentServiceImpl implements StudentService{

	@Override
	public void saveStudent(Student student) throws SQLException {
		
		System.out.println("StudentServiceImpl::saveStudent():start of this method");
		System.out.println(student);
		
		StudentDao studentDao = new StudentDaoImpl();
		studentDao.saveStudent(student);
		
	}
	

}
