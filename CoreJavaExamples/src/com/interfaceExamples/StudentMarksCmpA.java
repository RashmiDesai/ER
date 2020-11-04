package com.interfaceExamples;

import java.util.Comparator;

public class StudentMarksCmpA implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2)
	{
		//double marks1 =o1.getMarks();
		//double marks2=o2.getMarks();
		
		if (o1.getMarks() == o1.getMarks()) { 
            return 0;
       } else { 
          return o1.getMarks() > o1.getMarks() ? 1 : -1;
       }
		
	}

}
