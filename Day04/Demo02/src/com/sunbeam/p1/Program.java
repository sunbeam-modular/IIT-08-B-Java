package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {
	private static final String URL = "jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	// select
	public static void getAllStudents() {
		// String sql = "SELECT rollno,name,email,course FROM students";
		String sql = "SELECT * FROM students";
		try {
			Connection connection = getConnection();
			PreparedStatement selectStatement = connection.prepareStatement(sql);
			ResultSet rs = selectStatement.executeQuery();
			while (rs.next()) {
				int rollno = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				// String course = rs.getString(4);
				String course = rs.getString(5);
				System.out.println(rollno + " - " + name + " - " + email + " - " + course);
			}
			connection.close();
			selectStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// insert
	public static void addStudent() {
		String name = "Suresh";
		String email = "suresh@gmail.com";
		String course = "Java";

		String sql = "INSERT INTO students(name,email,course) VALUES(?,?,?)";
		try {
			Connection connection = getConnection();
			PreparedStatement insertStatement = connection.prepareStatement(sql);
			insertStatement.setString(1, name);
			insertStatement.setString(2, email);
			insertStatement.setString(3, course);
			insertStatement.executeUpdate();
			connection.close();
			insertStatement.close();
			System.out.println("Student is inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update
	public static void updateStudent() {
		// To-Do
	}

	// delete
	public static void deleteStudent() {
		// To-Do
	}

	public static void main(String[] args) {
		// Test the CRUD Operations
//		getAllStudents();
		addStudent();
	}

}
