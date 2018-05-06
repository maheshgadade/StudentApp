package com.student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static DBConnection dbConnection;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/mahesh";
    private String username = "root";
    private String password = "root";

    private DBConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnection getInstance() throws SQLException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        } else if (dbConnection.getConnection().isClosed()) {
            dbConnection = new DBConnection();
        }

        
        return dbConnection;
    }
    public static void main(String[] args) throws SQLException {
		DBConnection dbConnection = getInstance();
		if(dbConnection != null )
		{
			System.out.println("Connection sucsefully execute");
		}
			
	}
}
