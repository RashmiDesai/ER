package com.interfaceExamples;

import java.util.Comparator;

public class StudentMarksCmpD implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		double marks1 = o1.getMarks();
		double marks2=o2.getMarks();
		return Double.compare(marks1, marks2);
	}

}
