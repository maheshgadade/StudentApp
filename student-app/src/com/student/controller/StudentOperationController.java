package com.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.soap.Addressing;

import com.student.model.Student;
import com.student.service.StudentOperationService;
import com.student.service.StudentOperationServiceImpl;

@WebServlet("/StudentOperationController")
public class StudentOperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentOperationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       displayStudents(request, response);
	
	}
	
	public void displayStudents(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("welcome to studentopration controller");
		StudentOperationService operationService = new StudentOperationServiceImpl();
		List<Student> list = operationService.getStudents();
		System.out.println("Print list :: "+list);
		
		request.setAttribute("studentList", list);
		RequestDispatcher rd = request.getRequestDispatcher("jsp/displayStudents.jsp");
		rd.forward(request, response);
		
	}

}
