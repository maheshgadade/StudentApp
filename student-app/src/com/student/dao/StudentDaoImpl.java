package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void saveStudent(Student student) throws SQLException {
		DBConnection dbConnection = DBConnection.getInstance();
		Connection con = dbConnection.getConnection();

		// This logic use for auto increment sql table id
		
		int flag = 0;
		PreparedStatement ps = con.prepareStatement("select max(id) from users");
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			flag = rs.getInt(1);
			flag++;
		}
		
		

		if (con != null) {

			Statement statement = con.createStatement();

			student.setId(flag);
			String query = "insert into users values(" + student.getId() + ",'" + student.getFirstName() + "'," + "'"
					+ student.getLastName() + "'," + "'" + student.getCityName() + "'," + "'" + student.getEmail()
					+ "')";
			System.out.println("query = " + query);
			int count = statement.executeUpdate(query);
			System.out.println("conu is =" + count);
			if (count > 0) {
				System.out.println("StudentDaoImpl::saveStudent():Record inserted succesfully");
			} else {
				System.out.println("StudentDaoImpl::saveStudent():Error whil inserting record");
			}
		}

	}

}
