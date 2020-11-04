package com.corejava;

public class RecursionExample 
{
	
	public static void main(String[] args) 
	{	
		RecursionExample re= new RecursionExample();
		int i = 5; 
		//for(int i=0;i<15;i++)
	    System.out.println("Factoral of "+i+" is :"+re.findFactorial(i));
	}

	public int findFactorial(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return findFactorial(n-1)*n; 
	}
}