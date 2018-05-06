package com.student.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("StudentController::doPost():start of this method");
		Student student = new Student();

		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));
		student.setCityName(request.getParameter("cityName"));
		student.setEmail(request.getParameter("email"));

		StudentService studentService = new StudentServiceImpl();
		try {
			studentService.saveStudent(student);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(student);
		System.out.println("welcome");
		response.sendRedirect("jsp/demo.jsp");
	
	}
	  

}