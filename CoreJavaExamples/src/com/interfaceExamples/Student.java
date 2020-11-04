package com.interfaceExamples;

public class Student 
{
	int rollNo;
	String name;
	String address;
	double marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Student(int rollNo, String name, String address, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	
	
	
}
