package com.student.service;

import java.util.List;

import com.student.dao.StudentOperationDao;
import com.student.dao.StudentOperationDaoImpl;
import com.student.model.Student;

public class StudentOperationServiceImpl implements StudentOperationService {

	@Override
	public List<Student> getStudents() {
		
		System.out.println("welcome to studentopration service");
		
		StudentOperationDao dao = new StudentOperationDaoImpl();
		return dao.getStudent();
		
	}

}
