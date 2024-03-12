package com.hibernate;

public class Student {
	private int studentNumber;
	private String studentName;
	private double studentMarks;

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentMarks="
				+ studentMarks + "]";
	}
}
