package com.interfaceExamples;

import java.util.Scanner;

public class EnterInputFromSystem 
{
	Scanner in = new Scanner(System.in);
	
//	String str;
//	int num;
//	double doubleNum;
	
	//Enter string
	public String enterString()
	{
		  return(in.next());
	}
	
	//Enter integer
	public int enterInt()
	{
		return(in.nextInt());
	}
	
	//Enter decimal
	public double enterDecimal()
	{
		return(in.nextDouble());
	}
		
}
