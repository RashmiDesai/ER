package com.corejava;

public class PrimeExample {

	public static void main(String[] args)
	{
		int n = 4;
		int rem = 0;
		boolean flag = true;
		
		for(int i=2;i<=n/2;i++)
		{
			rem = n%2;
			if(rem == 0)
			{
				flag = false;
				break; 
			}
		}
		if(flag ==true)
			System.out.println("The number "+n+" is prime");
		else
			System.out.println("The number "+n+" is not prime");
	}

}
