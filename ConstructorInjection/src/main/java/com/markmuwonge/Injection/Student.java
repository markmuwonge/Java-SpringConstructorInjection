package com.markmuwonge.Injection;

public class Student {
	
	private String studentName;
	private int studentId;
	
	
	public Student(String studentName, int studentId)
	{
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student name " + "'" + studentName + "'" + " has an ID of " + "'" + studentId + "'");
	}
	

}
