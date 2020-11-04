package com.corejava;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = s.nextInt();
		
		int fib1=0,fib2=1;
		int fib3=0;
		if(n!=0)
		{
			if(n==1)
			{
				System.out.println("Fibbonacci series is :"+1);
			}
			else
			{
				System.out.print("Fibbonacci series is :"+0+" "+1);
				for(int i=0;i<n-2;i++)
				{	
					fib3=fib1+fib2;
					fib1=fib2;
					fib2=fib3;
					System.out.print(" "+fib3);
				}
			}
			}
			else
			{
				System.out.println("Number should be greater than zero!! ");
			}
	
	}

}
