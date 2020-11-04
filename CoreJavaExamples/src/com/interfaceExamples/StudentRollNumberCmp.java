package com.interfaceExamples;

import java.util.Comparator;

public class StudentRollNumberCmp implements Comparator<Student>
{
	@Override
	public int compare(Student arg0, Student arg1) 
	{	
		
		
		//System.out.println("The roll comparison is: "+(arg0.getRollNo()-arg1.getRollNo()));
		
	
		int rollNo1=arg0.getRollNo();
		int rollNo2=arg1.getRollNo();
		
		return rollNo1-rollNo2;
		//return arg0.getRollNo()-arg1.getRollNo();
		//return arg0.getRollNo()-arg1.getRollNo();
	}

	
	
	
}
