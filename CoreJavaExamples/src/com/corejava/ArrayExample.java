package com.corejava;

public class ArrayExample {

	public static void main(String[] args)
	{
		int month_days[]=new int[12];
		
		month_days[1] =29;
		
		for(int i=0;i<month_days.length;i++)
		System.out.println("Array index "+i+": "+month_days[i]);		
	}
 
}
