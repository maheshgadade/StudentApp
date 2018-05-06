package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentOperationDaoImpl implements StudentOperationDao {

	@Override
	public List<Student> getStudent() {
	
		List<Student> studentList = new ArrayList<>();
		
		System.out.println("welcome to studentopration dao");
		
		try {
			DBConnection dbConnection = DBConnection.getInstance();
			Connection con = dbConnection.getConnection();
			
			PreparedStatement preparedStatement = con.prepareStatement("Select * from users" );
			ResultSet rs = preparedStatement.executeQuery();
			
			
			while(rs.next())
			{
				Student student= new Student();
				
				student.setFirstName(rs.getString("first_name"));
				student.setLastName(rs.getString("last_name"));
				student.setCityName(rs.getString("city_name"));
				student.setEmail(rs.getString("email"));
				student.setId(rs.getLong("id"));
				
				studentList.add(student);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return studentList;
	}

}
