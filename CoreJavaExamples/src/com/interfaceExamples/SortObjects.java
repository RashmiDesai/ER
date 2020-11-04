package com.interfaceExamples;

import java.util.List;

public class SortObjects 
{

	public static void main(String[] args) 
	{ 
		try
		{
			StudentInfo sInfo=new StudentInfo();
			
			//Enter number of students
			int noOfStud = sInfo.studentQty();
			
			//Insert elements
			List<Student> studentdList = sInfo.insertElements(noOfStud);
			
			//Display object elements 
			sInfo.display(studentdList);
			
			//Sort  based on certain criteria
			sInfo.sortElements(studentdList);
		
		}
		catch(Exception e)
		{
			System.out.println("Exceptionn occured in main() ");
		}
	}

	

}
