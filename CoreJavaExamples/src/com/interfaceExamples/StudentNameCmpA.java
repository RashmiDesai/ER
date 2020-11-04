package com.interfaceExamples;

import java.util.Comparator;

public class StudentNameCmpA implements Comparator<Student>
{
	@Override
	public int compare(Student arg0, Student arg1) 
	{	
		String name1 = arg0.getName();
		String name2 = arg1.getName();

		return name1.compareTo(name2);
		
		//return arg0.getName().compareTo(arg1.getName());
	}
}
	