package com.interfaceExamples;

import java.util.Comparator;

public class StudentNameCmpD implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{ 
		String name1 = o1.getName();
		String name2 = o2.getName();

		return name2.compareTo(name1);
		//return o2.getName().compareTo(o1.getName());
	}

}
