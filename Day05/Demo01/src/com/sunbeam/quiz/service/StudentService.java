package com.sunbeam.quiz.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.quiz.dao.StudentDao;
import com.sunbeam.quiz.entity.Student;

// business logic
public class StudentService {

	public void displayStudents() {
		try (StudentDao studentDao = new StudentDao()) {
			List<Student> studentList = studentDao.getAllStudents();
			for (Student student : studentList) {
				System.out.println("****************************");
				System.out.println("Rollno - " + student.getRollno());
				System.out.println("Name - " + student.getName());
				System.out.println("Course - " + student.getCourse());
				System.out.println("****************************");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addStudent(Scanner sc) {
		Student student = new Student();
		System.out.println("Enter the name - ");
		student.setName(sc.next());
		System.out.println("Enter the email - ");
		student.setEmail(sc.next());
		System.out.println("Enter the course- ");
		student.setCourse(sc.next());
		try (StudentDao studentDao = new StudentDao()) {
			studentDao.insertStudent(student);
			System.out.println("Student added successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editStudent(Scanner sc) {
		System.out.println("Enter the rollno - ");
		int rollno = sc.nextInt();
		System.out.println("Enter the new course - ");
		String course = sc.next();
		try (StudentDao studentDao = new StudentDao()) {
			studentDao.updateStudent(rollno, course);
			System.out.println("Student updated successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void removeStudent(Scanner sc) {
		System.out.println("Enter the rollno - ");
		int rollno = sc.nextInt();
		try (StudentDao studentDao = new StudentDao()) {
			studentDao.deleteStudent(rollno);
			System.out.println("Student deleted successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
