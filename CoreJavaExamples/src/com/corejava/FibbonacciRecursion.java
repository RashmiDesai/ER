package com.corejava;

import java.util.Scanner;

public class FibbonacciRecursion 
{	
	public static void main(String[] args)
	{
		FibbonacciRecursion f= new FibbonacciRecursion();
		int m=0;
		System.out.println("Entere the number : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//System.out.println("Fibbonacci series s : "+0+" "+1+" ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(f.fib(m)+" ");
			m++;
		}
	}


 	private	int fib(int n)
	{
		if(n==0 || n==1) 
			return n;
		else
		return fib(n-1)+fib(n-2);
	}


}